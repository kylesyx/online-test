package com.ks_xlm.dao;

import com.ks_xlm.entity.TestPaper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface TestPaperDao {

    void answeradd(String answer);

    List<TestPaper> testPaperSelect(Integer[] id);
}
