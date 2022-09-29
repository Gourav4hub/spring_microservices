package com.cb.token.config;


import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.cb.token.entity.User;
import com.cb.token.service.UserService;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Value("${jwt.header.string}")
    public String HEADER_STRING;

    @Value("${jwt.token.prefix}")
    public String TOKEN_PREFIX;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenProvider jwtTokenUtil;

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println(request.getRequestURI());
    	return request.getRequestURI().startsWith("/web/") || request.getRequestURI().startsWith("/admin/authenticate");
    }
    
    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, 
    		FilterChain chain) throws IOException, ServletException 
    {    	
        String header = req.getHeader(HEADER_STRING);
        String username = null;
        String authToken = null;
        System.out.println(header);
        if (header != null && header.startsWith(TOKEN_PREFIX)) {
            authToken = header.replace(TOKEN_PREFIX,"");
            
            try {
                username = jwtTokenUtil.getUsernameFromToken(authToken);
                
                if (username != null) 
                {

                    UserDetails userDetails = userService.loadUserByUsername(username);
                    
                    User s;

                    if (jwtTokenUtil.validateToken(authToken, userDetails)) {
                        UsernamePasswordAuthenticationToken authentication = jwtTokenUtil.getAuthenticationToken(authToken, SecurityContextHolder.getContext().getAuthentication(), userDetails);
                        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));
                        logger.info("authenticated user " + username + ", setting security context");
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                    }
                    chain.doFilter(req, res);
                }else {
                	System.out.println("aaya1");
                	res.sendRedirect("/web/invalidToken");
                }
            } catch (IllegalArgumentException e) {
                logger.error("An error occurred while fetching Username from Token", e);
                System.out.println("aaya2");
                res.sendRedirect("/web/invalidToken");
            } catch (ExpiredJwtException e) {
                logger.warn("The token has expired", e);
                res.sendRedirect("/web/expireToken");
            } catch(SignatureException e){
                logger.error("Authentication Failed. Username or Password not valid.");
                System.out.println("aaya3");
                res.sendRedirect("/web/invalidToken");
            }
        } else 
        {
            logger.warn("Couldn't find bearer string, header will be ignored");
            res.sendRedirect("/web/noToken");
        }
    }
}