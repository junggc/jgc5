package jgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/ddd")
    public String main() {
        System.out.println("들어 오냐~~~");
        return "index";
    }

}
