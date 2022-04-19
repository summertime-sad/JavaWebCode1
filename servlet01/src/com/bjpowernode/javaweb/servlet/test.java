package com.bjpowernode.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class test extends chouxiang {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(this.confing);
    }

    @Override
    public void init() {
        System.out.println("巧妙地设计模式");
    }

    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git again");
        System.out.println("hello hot-fix");
    }


}
