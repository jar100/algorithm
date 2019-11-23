package study.spring_applitcatecontext;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

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
