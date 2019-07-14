package service.entityservice;

import mapper.entitymapper.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Paper;

import java.util.List;
import java.util.Map;

@Service
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public List<Paper> select(Map<String,String> map) {

        return paperMapper.select(map);
    }

    public void update(Map<String,String> map) {

        paperMapper.update(map);
    }

    public void insert(Map<String,String> map) {

        paperMapper.insert(map);
    }

    public void delete(String pano) {

        paperMapper.delete(pano);
    }
}
