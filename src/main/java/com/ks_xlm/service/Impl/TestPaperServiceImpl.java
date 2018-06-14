package com.ks_xlm.service.Impl;

import com.ks_xlm.dao.TestPaperDao;
import com.ks_xlm.entity.TestPaper;
import com.ks_xlm.service.TestPapaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestPaperServiceImpl implements TestPapaperService {
    @Autowired
    private TestPaperDao testPaperDao;


    @Override
    public void answeradd(String answer) {

    }

    @Override
    public List<TestPaper> testPaperSelect(Integer[] id) {
        return testPaperDao.testPaperSelect(id);
    }
}
