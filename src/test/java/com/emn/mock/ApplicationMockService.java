package com.emn.mock;

import com.emn.domain.Application;
import com.emn.service.ApplicationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * User: manu
 * Date: 16/10/12
 */
@Component
@Profile("test")
public class ApplicationMockService implements ApplicationService {

    public List<Application> lister() {
        List<Application> l = new ArrayList<Application>();
        l.add(new Application("angrybird", "game"));
        return l;
    }
}
