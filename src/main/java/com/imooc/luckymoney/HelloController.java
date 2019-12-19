package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
//    @PostMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "desc: " + limitConfig.getDescription();
        return "id: " + id;
    }
}
