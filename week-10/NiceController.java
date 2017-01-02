package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 2017.01.02..
 */
@Controller
public class NiceController {

    @Autowired
    JDBCConfig blabla2;

    @Autowired
    CounterBean counterBean;

    @RequestMapping("/bla")
    public String blaEndpoint() {
        counterBean.increment();
        return "bla";
    }
}
