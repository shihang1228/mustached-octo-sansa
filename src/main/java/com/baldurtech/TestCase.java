package com.baldurtech;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.Set;
import org.reflections.Reflections;

public class TestCase
{	
	public static void getAllClass(String classPackage)
	{	
        Reflections reflections = new Reflections(classPackage);
        Set<Class<? extends TestCase>> allClassCases = reflections.getSubTypesOf(TestCase.class);
    
        for(Class clazz:allClassCases)
        {
            System.out.println("Classing:" + clazz.getName());
            runAllMethods(clazz);
        }
	}
	
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
	public static void runAllMethods(Class clazz)
	{
		for(Method method: getAllClassMethods(clazz))
		{
			System.out.println("	classMethods:" + method.getName());
			try
			{
				Object obj = clazz.newInstance();
				method.invoke(obj,new Object[]{});
			}
			catch(Exception e)
			{
                System.out.println("Unexpected exception!");
                e.printStackTrace();
			}
		}
	}
}