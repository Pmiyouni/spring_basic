package com.icia.study.controller;

import com.icia.study.dto.StudyDTO;
import com.icia.study.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudyController {
    //StudyService 객체 주입
    @Autowired
    private StudyService studyService;
    @GetMapping("/req1")
    public String req1(){
        //StudyService 클래스의 req1메서드 호출
        studyService.req1();
        return "index";
    }

    @GetMapping("/req2")
    public String req2(@RequestParam("q1")String q1, @RequestParam("q2") String q2){
        //변수 받는경우 
        studyService.req2(q1,q2);
        return "index";
    }
    @PostMapping("/req3")
    public String req3(@ModelAttribute StudyDTO studyDTO) {
        studyService.req3(studyDTO);
        //dto로 한번에 받으려면 사용 * 반드시 DTO에 @Setter @Getter @ToString를 추가해야함

        return "index";
    }
    @GetMapping("/req4")
    public String req4(Model model){
        StudyDTO studyDTO=studyService.req4();
        model.addAttribute("study",studyDTO);
        //가져갈 데이터 담음, model은 controller에서만 사용
        return "req4";
        //목적지를 정한다
    }

    @GetMapping("/req5")
    public String req5(Model model){
        List<StudyDTO> studyDTOList=studyService.req5();
        model.addAttribute("studylist",studyDTOList);
        return "req5";
    }
}




