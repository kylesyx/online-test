package com.ks_xlm.dao;

import com.ks_xlm.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tianmao on 2018/6/7.
 */
@Component
@Repository
//@Mapper
public interface QuestionDao {

    //试题添加
    void questionAdd(Question question);

    //试题删除
    void questionDelete(Integer[] id);

    //试题修改
    void questionUpdate(Question question);

    //试题查询；分页
    List<Question> questionSelect(Integer[] id);
}