servlet是Javaweb的三大组件之一
servlet 的作用，在服务器端的小程序
每个servlet都是唯一的，处理的请求是不同的
接收请求数据
处理请求
完成相应

实现servlet的方式
实现servlet有三种方式
实现javax.servlet.Servlet接口
继承javax.servlet.GenericServlet类
继承javax.servlet.HttpServlet类
通常我们会继承HttpServlet类来完成我们的Servlet，但学习Servlet还要从javax.servlet.Servlet接口开始学习

通常servlet不由我们调用，而是tomcat来调用，或者其他服务器调用。并且，servlet的对	象也不由我们来创建，由tomcat来创建

ServletConfig


