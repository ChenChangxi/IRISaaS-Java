package mapper.connectmapper;

import java.util.List;
import java.util.Map;

public interface SCMapper {

    public List<String> selectSno(String cno);

    public List<String> selectCno(String sno);

    public void insert(Map<String,String> map);

    public void delete(Map<String,String> map);
}
