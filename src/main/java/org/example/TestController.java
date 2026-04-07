package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // 加点注释
    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
