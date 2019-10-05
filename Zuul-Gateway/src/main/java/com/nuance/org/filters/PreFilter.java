package com.nuance.org.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {
	 
	  @Override
	  public String filterType() {
	    return "pre";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  @Override
	  public Object run() {
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	   // HttpServletResponse response = ctx.getResponse();
	    request.getHttpServletMapping();
	   
	    
	    
	   
	    
	    
	    
	    
	    
	    System.out.println( request.getLocalAddr()+request.getLocalPort()+request.getPathInfo()+ request.getRemotePort()+request.getRemoteAddr()
	    +request.getRemoteUser()+request.getRequestURI()+request.getServerPort());
	    System.out.println(request.getRemoteAddr()); 
	    System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
	    return null;
	  }
	}
