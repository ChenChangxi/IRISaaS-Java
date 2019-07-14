package mapper.entitymapper;

import table.entity.Scientist;

import java.util.List;
import java.util.Map;

public interface ScientistMapper {

    public List<Scientist> select(Map<String,String> map);

    public void update(Map<String,String> map);

    public void delete(String no);

    public void insert(Map<String,String> map);
}
