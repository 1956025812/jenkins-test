package com.jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    private static final Logger logger = LoggerFactory.getLogger(JenkinsController.class);

    @GetMapping("/test")
    public String testJenkins() {
        logger.info("hello Jenkins");
        return "hello Jenkins";
    }

}
