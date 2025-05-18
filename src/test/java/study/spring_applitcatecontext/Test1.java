package study.spring_applitcatecontext;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;


public class Test1 implements InitializingBean {

    public Test1() {
        System.out.println("생성자");
    }


    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterProperties");
    }
}
