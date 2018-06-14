package com.ks_xlm.service;

import com.ks_xlm.entity.Achievement;

import java.util.List;

public interface AchievementService {
    List<Achievement> achievementSelect(Integer[] id);
}
