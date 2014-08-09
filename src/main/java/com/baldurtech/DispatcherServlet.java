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
            ContactListServlet contactListServlet = new ContactListServlet();
            contactListServlet.say();
        }
        else if(req.getRequestURI().equals("/mustached-octo-sansa/contact/show"))
        {
            ContactShowServlet contactShowServlet = new ContactShowServlet();
            contactShowServlet.say();
        }
        else if(req.getRequestURI().equals("/mustached-octo-sansa/depart/list"))
        {
            DepartListServlet departListServlet = new DepartListServlet();
            departListServlet.say();
        }
        else if(req.getRequestURI().equals("/mustached-octo-sansa/depart/show"))
        {
            DepartShowServlet departShowServlet = new DepartShowServlet();
            departShowServlet.say();
        }
        else
        {
            resp.getWriter().println("failed!!!");
        }
    }
}