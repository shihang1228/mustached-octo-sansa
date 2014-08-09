package com.baldurtech;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class ContactListServlet extends TestCase
{    
    public void say_list(HttpServletRequest req) throws IOException
    {
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        System.out.println("name: " + name);
        System.out.println("mobile: " + mobile);       
    }
}