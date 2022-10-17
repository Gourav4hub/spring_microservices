const express = require('express')
const eurekaHelper = require('./eureka-helper')

const server = express()
server.use(express.urlencoded())
server.use(express.json())

server.post("/express/save",(req,res)=>{
    var data = req.body
    res.json({status:true,msg:"Service 1",data:data})
})

server.listen(8089,()=>{
    eurekaHelper.registerWithEureka('express-service', 8089);
    console.log("http://localhost:8089")
})