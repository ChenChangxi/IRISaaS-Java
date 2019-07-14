package service.entityservice;

import mapper.entitymapper.ScientistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Scientist;

import java.util.List;
import java.util.Map;

@Service
public class ScientistService {

    @Autowired
    private ScientistMapper scientistMapper;

    public List<Scientist> select(Map<String,String> map) {

        return scientistMapper.select(map);
    }

    public void update(Map<String,String> map) {

        scientistMapper.update(map);
    }

    public void insert(Map<String,String> map) {

        scientistMapper.insert(map);
    }

    public void delete(String sno) {

        scientistMapper.delete(sno);
    }
}
