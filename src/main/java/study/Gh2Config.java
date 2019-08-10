package study;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Gh2Config {
    @Bean
    public String ghString2() {
        String s = "ghString2";
        System.out.println("Bean created : ghString2!!!!!!");
        return s;
    }
}
