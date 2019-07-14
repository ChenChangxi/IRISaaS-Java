package mapper.entitymapper;

import table.entity.Paper;

import java.util.List;
import java.util.Map;

public interface PaperMapper {

    public List<Paper> select(Map<String,String> map);

    public void update(Map<String,String> map);

    public void delete(String no);

    public void insert(Map<String,String> map);
}
