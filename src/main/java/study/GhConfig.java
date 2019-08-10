package study;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GhConfig {
    @Bean
    public String ghString() {
        String s = "가나다.";
        System.out.println("Bean created : ghString");
        return s;
    }


    @Bean
    @Scope(value = "prototype")
    public String ghhh() {
        String s = "나나나";
        System.out.println("Bean created :" + s);
        return s;
    }
}
