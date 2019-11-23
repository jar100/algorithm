package study.spring_applitcatecontext;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import study.BeanFactoryPostProcessorTest;
import study.GhConfig;

import javax.inject.Inject;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {GhConfig.class, BeanFactoryPostProcessorTest.class})
public class ApplicationContextTest {

    @Inject
    @Qualifier("ghhh")
    private String ghString2;

    @Inject
    private String ghString;

    @Test
    void createBean() {
        System.out.println("used ghString : " + ghString);
        System.out.println("used ghString2 : " + ghString2);

    }

    @Test
    void name() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(GhConfig.class);

        //스코프가 prototype 라 재생성 됨
        String str = applicationContext.getBean("ghhh", String.class);
        System.out.println("get bean 1: " + str);

        //스코프가 싱글톤이라 재생성안됨
        str = applicationContext.getBean("ghString", String.class);
        System.out.println("get bean: 2" + str);

        str = applicationContext.getBean("ghhh", String.class);
        System.out.println("get bean: 3" + str);

        str = applicationContext.getBean("ghhh", String.class);
        System.out.println("get bean: " + str);
    }
}