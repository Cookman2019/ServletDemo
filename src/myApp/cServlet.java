package myApp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;



public class cServlet extends bServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        super.service(servletRequest, servletResponse);
        String value = super.getInitParameter("p1");
        // todo: 输出的结果是 null
        System.out.println(value);
    }

    @Override
    public void init(){
        System.out.println("覆盖父类的方法");
    }
}
