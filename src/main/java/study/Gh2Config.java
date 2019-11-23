package study;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Gh2Config implements BeanPostProcessor {
    @Bean
    public String ghString2() {
        String s = "ghString2";
        System.out.println("Bean created : ghString2!!!!!!");
        return s;
    }

    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {

        return null;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
        return null;
    }
}
