package hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@ComponentScan("com.app.controleur")
public class MvcConfig extends WebMvcConfigurerAdapter {
   
   @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    	
   	registry.addViewController("/formUser").setViewName("formUser");
        registry.addViewController("/home").setViewName("home");
       
     
       registry.addViewController("/hello").setViewName("hello");
      registry.addViewController("/login").setViewName("login");
   }

}
