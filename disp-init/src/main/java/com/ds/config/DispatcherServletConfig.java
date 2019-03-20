package com.ds.config;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.w3c.dom.views.AbstractView;


/*public class DispatcherServletConfig implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> classType, ServletContext context) throws ServletException {
       		XmlWebApplicationContext rootApplicationContext=null;
       		XmlWebApplicationContext servletApplicationContext=null;
       		ContextLoaderListener contextLoaderListener=null;
       		DispatcherServlet dispatcherServlet=null;
       		
       		rootApplicationContext=new XmlWebApplicationContext();
       		rootApplicationContext.setConfigLocation("/WEB-INF/application-context.xml");
       		
       		contextLoaderListener=new ContextLoaderListener(rootApplicationContext);
       		context.addListener(contextLoaderListener);
       		
       		servletApplicationContext=new XmlWebApplicationContext();
       		servletApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
       		
       		dispatcherServlet=new DispatcherServlet(servletApplicationContext);
       		ServletRegistration.Dynamic config=context.addServlet("dispatcher",dispatcherServlet);
       		System.out.println(config);
       		config.setLoadOnStartup(2);
       		config.addMapping("*.htm");
       		
       		
     }  		
	}
*/


public class DispatcherServletConfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext context=null;
         DispatcherServlet dispatcherServlet=null;
         
         context=new XmlWebApplicationContext();
         context.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
         dispatcherServlet=new DispatcherServlet(context);
         
         ServletRegistration.Dynamic config=servletContext.addServlet("dispatcher",dispatcherServlet);
         config.setLoadOnStartup(1);
         config.addMapping("*.htm");
       }  
	}
	



















