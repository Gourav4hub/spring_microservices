import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cb.dao.EmployeeDao;
import com.cb.model.EmpData;
import com.google.gson.Gson;

@WebServlet(name = "empdata",urlPatterns = "/empdata")
public class EmpServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			EmployeeDao dao = new EmployeeDao();
			List<EmpData> list = dao.list();
			Gson gson = new Gson();
			String str  = gson.toJson(list);
			resp.getWriter().write(str);
	}
}
