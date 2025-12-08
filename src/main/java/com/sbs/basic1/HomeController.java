package com.sbs.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller 의미
// 개발자가 스프링부트한테 말한다.
// 아래 있는 HomeController는 컨트롤러이다 라고 말하는 것.
@Controller
public class HomeController {
    @GetMapping("/home/main")
    @ResponseBody
    public String showHome() {
        return "안녕하세요.";
    }
}
