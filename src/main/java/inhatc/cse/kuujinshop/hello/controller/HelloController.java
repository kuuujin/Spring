package inhatc.cse.kuujinshop.hello.controller;

import inhatc.cse.kuujinshop.hello.dto.HelloDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloController {

    @GetMapping("/")
    public String hello(Model model) {
        HelloDto helloDto = HelloDto.builder()
                .dept("철학과")
                .name("최길동")
                .build();

        model.addAttribute("data", helloDto);
        return "hello";
    }
}
