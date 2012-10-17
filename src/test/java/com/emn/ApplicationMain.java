package com.emn;

import com.emn.service.ApplicationService;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

/**
 * User: manu
 * Date: 16/10/12
 */

public class ApplicationMain {

    public static void main(String[] args){
        testProfile("dev");
        testProfile("test");
    }

    private static void testProfile(String profile) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.load("classpath:spring-config.xml");

        ApplicationService applicationService = context.getBean(ApplicationService.class);
        System.out.println(applicationService);
        System.out.println(applicationService.lister());
    }
}
