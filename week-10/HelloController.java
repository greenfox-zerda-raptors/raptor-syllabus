package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 2016.12.18..
 */
@Controller
public class HelloController {

    @Autowired
    JDBCConfig blabla;

    @Autowired
    CounterBean counterBean;

    @RequestMapping("/hello12312")
    public String hello() {
        counterBean.increment();
        return "index";
    }
}
