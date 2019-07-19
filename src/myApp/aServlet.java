package myApp;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

// Servlet
// 单例，线程不安全
// 类可以自己写，对象由服务器创建


public class aServlet implements Servlet {
    @Override
    // 声明周期方法，只调用一次
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init(ServletConfig servletConfig)");
        // 获取初始化参数
        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));

        // 获取所有初始化参数的名称

        Enumeration e = servletConfig.getInitParameterNames();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }





    }

    // 获取配置信息
    @Override
    public ServletConfig getServletConfig() {
        System.out.println(" getServletConfig ");

        return null;
    }

    // 生命周期方法，会多次调用

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(" service");

    }

    // 一般不用

    @Override
    public String getServletInfo() {

        System.out.println(" getServletInfo");
        return null;
    }

    // 生命周期方法，只调用一次

    @Override
    public void destroy() {

        System.out.println(" destroy");


    }
}
