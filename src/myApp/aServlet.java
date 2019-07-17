package myApp;

import javax.servlet.*;
import java.io.IOException;

public class aServlet implements Servlet {
    @Override
    // 声明周期方法，只调用一次
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    // 获取配置信息
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 生命周期方法，会多次调用

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    // 一般不用

    @Override
    public String getServletInfo() {
        return null;
    }

    // 生命周期方法，只调用一次

    @Override
    public void destroy() {

    }
}
