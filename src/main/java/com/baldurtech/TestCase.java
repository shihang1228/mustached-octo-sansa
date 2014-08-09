package com.baldurtech;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.reflections.Reflections;

public class TestCase
{	
	private static List<Method> getAllClassMethods(Class clazz)
	{
		List<Method> classMethods = new ArrayList<Method>();
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method: methods)
		{
			if(method.getName().startsWith("say"))
			{
				classMethods.add(method);
			}
		}
		return classMethods;
	}
	public static void runAllMethods(Class clazz,HttpServletRequest req)
	{
        System.out.println("ClassName: " + clazz.getName());
		for(Method method: getAllClassMethods(clazz))
		{
			System.out.println("	classMethods:" + method.getName());
			try
			{
				Object obj = clazz.newInstance();
				method.invoke(obj,new Object[]{req});
			}
			catch(Exception e)
			{
                System.out.println("Unexpected exception!");
                e.printStackTrace();
			}
		}
	}
}