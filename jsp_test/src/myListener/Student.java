package myListener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

/*
HttpSessionBindingListener监听器可以使javaBean对象在被绑定到会话或从会话中取消对它的绑定时得到通知。
该监听器是由实体类来实现，需要注意的是该监听器的实现类不需要在web.xml文件中进行配置。
 */
public class Student implements HttpSessionBindingListener {

    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("Student对象被添加到session中");
    }
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("Student对象从session中被删除了");
    }

}
