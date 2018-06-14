package com.ks_xlm.service.Impl;

import com.ks_xlm.dao.AchievementDao;
import com.ks_xlm.entity.Achievement;
import com.ks_xlm.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AchievementServiceImpl implements AchievementService {
    @Autowired
    private AchievementDao achievementDao;

    @Override
    public List<Achievement> achievementSelect(Integer[] id) {
        return achievementDao.achievementSelect(id);
    }
}
