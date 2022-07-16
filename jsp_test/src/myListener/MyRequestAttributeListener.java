package myListener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("向request中添加了一个属性");
        System.out.println("属性名："+srae.getName());
        System.out.println("属性值："+srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("从request中删除了一个属性");
        System.out.println("属性名："+srae.getName());
        System.out.println("属性值："+srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("修改了request中的一个属性");
        System.out.println("属性名："+srae.getName());
        System.out.println("属性值："+srae.getValue());
    }


}
