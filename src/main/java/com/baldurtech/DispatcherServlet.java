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
        resp.getWriter().println("dispatcherServlet");
        String classPackage = "com.baldurtech.";
        String className = convertUriToClassName(req.getRequestURI());                
        runAllMethods(classPackage,className,req);
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
    {
        String classPackage = "com.baldurtech.";
        String className = convertUriToClassName(req.getRequestURI());                
        runAllMethods(classPackage,className,req);
    }

    public String convertUriToClassName(String uri)
    {
        String arrayUri[] = uri.split("\\/");
        String className = arrayUri[3].substring(0,1).toUpperCase() + arrayUri[3].substring(1)
                         + arrayUri[4].substring(0,1).toUpperCase() + arrayUri[4].substring(1) 
                         + "Servlet";
        return className;
    }
    
    public void runAllMethods(String classPackage, String className,HttpServletRequest req)
    {
        try
        {   
            TestCase testCase = new TestCase();
            testCase.runAllMethods(Class.forName("com.baldurtech." + className),req);       
        }
        catch(Exception ex)
        {
            ex.printStackTrace();            
        }
    }
}