package chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2022/3/13
 * desc
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Knight bean = context.getBean(Knight.class);
        bean.embarkOnQuest();

    }
}
