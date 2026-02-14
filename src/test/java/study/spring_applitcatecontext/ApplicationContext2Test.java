package study.spring_applitcatecontext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.GhConfig;

import jakarta.inject.Inject;

public class ApplicationContext2Test {


    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(GhConfig.class);

        System.out.println(context.getBean("ghString"));

        context.close();

        System.out.println(context.getBean("ghString"));

    }
}
