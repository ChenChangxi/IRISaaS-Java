package mapper.connectmapper;

import java.util.List;
import java.util.Map;

public interface SPAMapper {

    public List<String> selectSno(String pano);

    public List<String> selectPano(String sno);

    public void insert(Map<String,String> map);

    public void delete(Map<String,String> map);

}