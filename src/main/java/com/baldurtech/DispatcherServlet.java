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
        if(req.getRequestURI().equals("/mustached-octo-sansa/contact/list"))
        {
            TestCase testCase = new TestCase();
            testCase.runAllMethods(ContactListServlet.class);
        }
        else if(req.getRequestURI().equals("/mustached-octo-sansa/contact/show"))
        {
            TestCase testCase = new TestCase();
            testCase.runAllMethods(ContactShowServlet.class);
        }
        else if(req.getRequestURI().equals("/mustached-octo-sansa/depart/list"))
        {
            TestCase testCase = new TestCase();
            testCase.runAllMethods(DepartListServlet.class);
        }
        else if(req.getRequestURI().equals("/mustached-octo-sansa/depart/show"))
        {
            TestCase testCase = new TestCase();
            testCase.runAllMethods(DepartShowServlet.class);
        }
        else
        {
            resp.getWriter().println("failed!!!");
        }
    }
}