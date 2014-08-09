package com.baldurtech;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String uri = req.getRequestURI();
        String arrayUri[] = uri.split("\\/");
        String className = arrayUri[2].substring(0,1).toUpperCase() + arrayUri[2].substring(1)
                         + arrayUri[3].substring(0,1).toUpperCase() + arrayUri[3].substring(1) 
                         + "Servlet";
                         
        TestCase testCase = new TestCase();
        try
        {   
            testCase.runAllMethods(Class.forName("com.baldurtech." + className));       
        }
        catch(Exception ex)
        {
            ex.printStackTrace();            
        }
    }
}