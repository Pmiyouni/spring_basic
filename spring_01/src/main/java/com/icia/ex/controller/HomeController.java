package com.icia.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //프로젝트 실행시 기본주소(/)요청 매서드 선언
    //프로젝트 시작하면 index.jsp를 브라우저에 출력
    @GetMapping("/")  //시작 주소는 /
    public String index() {
        return "index"; //index.jsp를 띄운다
    }
}
