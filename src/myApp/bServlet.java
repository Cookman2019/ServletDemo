package myApp;

import javax.servlet.*;
import java.io.IOException;

// 模拟 GenericServlet
public class bServlet implements Servlet {
    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        //把 tomcat 传过来的值保存到变量中
        this.servletConfig = servletConfig;
        init();
    }

    // 自己定义的方法，不属于 tomcat 接口中的方法

    public void init(){

    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("每次处理请求都会被调用");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    // 模拟 GenericServlet

    public ServletContext getServletContext(){
        return servletConfig.getServletContext();
    }

    public String getServletName(){
        return servletConfig.getServletName();
    }
    public String getInitParameter(String name){
        return this.servletConfig.getInitParameter(name);

    }
}


