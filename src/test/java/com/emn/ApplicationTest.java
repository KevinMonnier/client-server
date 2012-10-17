package com.emn;

import com.emn.service.ApplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: manu
 * Date: 16/10/12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
@ActiveProfiles("test")
public class ApplicationTest {

    @Autowired
    ApplicationService applicationService;


    @Test
    public void listerApp(){
        System.out.println(applicationService);
        System.out.println(applicationService.lister());
    }
}
