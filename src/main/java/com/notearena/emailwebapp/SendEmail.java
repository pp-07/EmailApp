/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notearena.emailwebapp;


import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*; 
  
public class SendEmail extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String name=request.getParameter("sender");  
String toEmails=request.getParameter("receiver");  
String message=request.getParameter("message");  
String subject1=request.getParameter("subject"); 

String subject = "Test email";


    out.print("Message sent successfully : "+ "From : "+ name +" " +"To : " + "  "+ toEmails); 
  
          
 
}
 
  
}  
