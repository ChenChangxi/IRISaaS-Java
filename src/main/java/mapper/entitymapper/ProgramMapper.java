package mapper.entitymapper;

import table.entity.Program;

import java.util.List;
import java.util.Map;

public interface ProgramMapper {

    public List<Program> select(Map<String,String> map);

    public void update(Map<String,String> map);

    public void delete(String no);

    public void insert(Map<String,String> map);
}
