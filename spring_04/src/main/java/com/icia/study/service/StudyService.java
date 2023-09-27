package com.icia.study.service;

import com.icia.study.dto.StudyDTO;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyService {
    public void req1(){
        System.out.println("StudyService.req1");
    }
    public void req2(String q1, String q2){
        System.out.println("StudyService.req2");
        System.out.println("q1 = " + q1 + "q2 =" + q2);
    }
    public void req3(StudyDTO studyDTO){
        System.out.println("StudyService.req3");
        System.out.println("studyDTO = " + studyDTO);
    }
    public  StudyDTO req4(){
        StudyDTO studyDTO = new StudyDTO();
        studyDTO.setP1("p1에 담긴 값");
        studyDTO.setP2("p2에 담긴 값");
        studyDTO.setP3(100);
        return studyDTO;
    }

    public  List<StudyDTO> req5() {
        List<StudyDTO> studyDTOList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            StudyDTO studyDTO = new StudyDTO();
            studyDTO.setP1("p1값 " + i);
            studyDTO.setP2("p2값 " + i);
            studyDTO.setP3(i);
            //studyDTOList.add(studyDTO);

        }
        System.out.println("studyDTOList = " + studyDTOList);
        return studyDTOList;
    }
}
