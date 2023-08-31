package com.ex.demo.controller;

import com.ex.demo.dto.DemoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/demo1")
    public String demo1(){
        return "demo1";
    }

    @PostMapping("/demo2")
    public String demo2(@RequestParam("param1")String param1, @RequestParam("param2") String param2){
        System.out.println("param1 =" +param1 + "/" + "param2 =" + param2 );
        DemoDTO demoDTO= new DemoDTO();
        return "index";
    }
    @PostMapping("/demo3")
    public String demo3(@ModelAttribute DemoDTO demoDTO){
        // @ModelAttribute는 사용자가 요청시 전달하는 값을 오브젝트 형태로 매핑해주는 어노테이션
        System.out.println("demoDTO = " + demoDTO);
        return "hello";
    }
}
//    @RequestMapping(method = RequestMethod.GET, value = "/req1")
