package com.springtutorial.productlist;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductlistApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext Context = SpringApplication.run(ProductlistApplication.class, args);

        /*
        MyComponent myComponent = Context.getBean(MyComponent.class);
        myComponent.getMessage();
        */

        MyApp myApp = Context.getBean(MyApp.class);
        myApp.run();
    }

}
