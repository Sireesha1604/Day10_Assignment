package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("----- Loaded Beans -----");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        LibraryService service = context.getBean(LibraryService.class);
        service.operate();
    }
}
