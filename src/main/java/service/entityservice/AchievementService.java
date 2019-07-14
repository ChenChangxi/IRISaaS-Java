package service.entityservice;

import mapper.entitymapper.AchievementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Achievement;

import java.util.List;
import java.util.Map;

@Service
public class AchievementService {

    @Autowired
    private AchievementMapper achievementMapper;

    public List<Achievement> select(Map<String,String> map) {

        return achievementMapper.select(map);
    }

    public void update(Map<String,String> map) {

        achievementMapper.update(map);
    }

    public void insert(Map<String,String> map) {

        achievementMapper.insert(map);
    }

    public void delete(String ano) {

        achievementMapper.delete(ano);
    }
}
