package mapper.connectmapper;

import java.util.List;
import java.util.Map;

public interface SPMapper {

    public List<String> selectSno(String pno);

    public List<String> selectPno(String sno);

    public void insert(Map<String,String> map);

    public void delete(Map<String,String> map);
}
