package com.icia.demo.repository;

import com.icia.demo.dto.DemoDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoDBRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public void reqdb1(DemoDTO demoDTO) {
    sql.insert("Demo.save",demoDTO); //demoDTO 자리는 하나만, 유형을 넣어도된(int 등)
    }

    public List<DemoDTO> findAll() {
        return sql.selectList("Demo.findAll"); //selectList는 list타입으로 받음
    }

    public DemoDTO findById(Long id) {
        return sql.selectOne("Demo.findById", id);
    }
}
