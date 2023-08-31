package com.ex.demo.controller;

import com.ex.demo.dto.DemoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ResultCotroller {
    @GetMapping("/result1")
    public String result1(Model model){
        String value1="안녕하세요";
        //model 객체에 화면에 출력할 데이터를 담아감
        model.addAttribute("m1",value1);
        // s는 String, "m1"은 가져갈 변수, value1은 object로 모든것을 담음/담을 값
        return "result1";
    }

    @GetMapping("/result2")
    public String result2(Model model){
        // 파라미터의 값을 보여주기위해 전달
        // Model 객체는 컨트롤러에서 데이터를 생성해 이를 JSP 즉 View에 전달하는 역할, 키(key)와, 밸류(value) 값을 저장
        DemoDTO demoDTO = new DemoDTO();
        demoDTO.setParam1("param1에 담긴 값");
        demoDTO.setParam2("param2에 담긴 값");
        model.addAttribute("demo",demoDTO);
        return "result2";
    }

    @GetMapping("/result3")
    public String result3(Model model){
        List<DemoDTO> demoDTOList =new ArrayList<>();
        for(int i=0;i<=10;i++){
            DemoDTO demoDTO=new DemoDTO();
            demoDTO.setParam1("param1 값"+i);
            demoDTO.setParam2("param2 값"+i);
            demoDTOList.add(demoDTO);
        }
        System.out.println("demolist"+demoDTOList);
        model.addAttribute("demolist",demoDTOList);
        return "result3";
    }
}
