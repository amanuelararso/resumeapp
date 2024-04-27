package com.amanuel.resume;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/")
    public String getWelcomeMessage() {

        return "Hello World...!!!";
    }
}
