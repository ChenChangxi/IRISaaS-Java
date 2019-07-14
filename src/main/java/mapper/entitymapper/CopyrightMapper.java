package mapper.entitymapper;

import table.entity.Copyright;

import java.util.List;
import java.util.Map;

public interface CopyrightMapper {

    public List<Copyright> select(Map<String,String> map);

    public void update(Map<String,String> map);

    public void delete(String no);

    public void insert(Map<String,String> map);
}
