package com.ks_xlm.controller;

import com.ks_xlm.entity.Question;
import com.ks_xlm.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianmao on 2018/6/7.
 */

@RestController
@RequestMapping("/qc")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/qadd")
    public void questionAdd(Question question){
        questionService.questionAdd(question);
        return;
    }
}
