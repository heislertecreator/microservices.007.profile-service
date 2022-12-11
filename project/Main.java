package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Main extends SpringBootServletInitializer {


//    @Bean
//    public DispatcherServletRegistrationBean dispatcherServletRegistrationBean() {
//        return new DispatcherServletRegistrationBean(new DispatcherServlet(), "/");
//    }

//    @Bean
//    public ServletWebServerFactory servletWebServerFactory() {
//        return new TomcatServletWebServerFactory();
//    }

    public static void main(String[] args) {
        String[] args2 = new String[] { "--debug" };
        SpringApplication.run(Main.class, args);
    }
}
