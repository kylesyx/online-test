package com.ks_xlm.service;

import com.ks_xlm.entity.Question;

import java.util.List;

/**
 * Created by tianmao on 2018/6/7.
 */
public interface QuestionService {

    //试题添加
    void questionAdd(Question question);

    //试题删除
    void questionDelete(Integer[] id);

    //试题修改
    void questionUpdate(Question question);

    //试题查询；分页
    List<Question> questionSelect(Integer[] id);
}
