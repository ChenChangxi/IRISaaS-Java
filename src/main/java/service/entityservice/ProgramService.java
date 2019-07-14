package service.entityservice;

import mapper.entitymapper.ProgramMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Program;

import java.util.List;
import java.util.Map;

@Service
public class ProgramService {

    @Autowired
    private ProgramMapper programMapper;

    public List<Program> select(Map<String,String> map) {

        return programMapper.select(map);
    }

    public void update(Map<String,String> map) {

        programMapper.update(map);
    }

    public void insert(Map<String,String> map) {

        programMapper.insert(map);
    }

    public void delete(String pno) {

        programMapper.delete(pno);
    }
}
