package com.ks_xlm.service;

import com.ks_xlm.entity.TestPaper;

import java.util.List;

public interface TestPapaperService {

    void answeradd(String answer);

    List<TestPaper> testPaperSelect(Integer[] id);
}
