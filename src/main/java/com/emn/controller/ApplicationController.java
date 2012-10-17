package com.emn.controller;

import com.emn.domain.Application;
import com.emn.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * User: manu
 * Date: 16/10/12
 */
@Controller
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @RequestMapping("/")
    public void home(Writer responseWriter) throws IOException {
        responseWriter.write("Home");
    }

    @RequestMapping(value = "/application", method = RequestMethod.GET)
    public void list(Writer responseWriter) throws IOException {
        List<Application> applications = applicationService.lister();
        responseWriter.write(applications.toString());
    }
}
