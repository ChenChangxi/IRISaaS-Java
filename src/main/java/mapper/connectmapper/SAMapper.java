package mapper.connectmapper;

import java.util.List;
import java.util.Map;

public interface SAMapper {

    public List<String> selectAno(String sno);

    public List<String> selectSno(String ano);

    public void insert(Map<String,String> map);

    public void delete(Map<String,String> map);
}
