package mapper.entitymapper;

import table.entity.Achievement;

import java.util.List;
import java.util.Map;

public interface AchievementMapper {

    public List<Achievement> select(Map<String,String> map);

    public void update(Map<String,String> map);

    public void delete(String no);

    public void insert(Map<String,String> map);
}
