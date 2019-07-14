package mapper.connectmapper;

import java.util.List;
import java.util.Map;

public interface APAMapper {

    public List<String> selectPano(String ano);

    public List<String> selectAno(String pano);

    public void insert(Map<String,String> map);

    public void delete(Map<String,String> map);
}