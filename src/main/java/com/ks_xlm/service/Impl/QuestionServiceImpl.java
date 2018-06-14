package com.ks_xlm.service.Impl;

import com.ks_xlm.dao.QuestionDao;
import com.ks_xlm.entity.Question;
import com.ks_xlm.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tianmao on 2018/6/7.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Override
    public void questionAdd(Question question) {
        questionDao.questionAdd(question);
    }

    @Override
    public void questionDelete(Integer[] id) {
        questionDao.questionDelete(id);
    }

    @Override
    public void questionUpdate(Question question) {
        questionDao.questionUpdate(question);
    }

    @Override
    public List<Question> questionSelect(Integer[] id) {

        return questionDao.questionSelect(id);
    }
}
