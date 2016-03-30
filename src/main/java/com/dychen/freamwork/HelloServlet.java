package com.dychen.freamwork;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cdy on 2016/3/30.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet { //继承HttpServlet类，让当前类变成一个servlet类
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());

        // 将当前时间放入HttpServletRequest对象中，最后转发到 WEB-INF/jsp/hello.jsp 页面
        req.setAttribute("currentTime",currentTime);
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
