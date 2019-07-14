package service.entityservice;

import mapper.entitymapper.CopyrightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Copyright;

import java.util.List;
import java.util.Map;

@Service
public class CopyrightService {

    @Autowired
    private CopyrightMapper copyrightMapper;

    public List<Copyright> select(Map<String,String> map) {

        return copyrightMapper.select(map);
    }

    public void update(Map<String,String> map) {

        copyrightMapper.update(map);
    }

    public void insert(Map<String,String> map) {

        copyrightMapper.insert(map);
    }

    public void delete(String cno) {

        copyrightMapper.delete(cno);
    }
}
