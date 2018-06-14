package com.ks_xlm.dao;

import com.ks_xlm.entity.Achievement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AchievementDao {

    List<Achievement> achievementSelect(Integer[] id);
}
