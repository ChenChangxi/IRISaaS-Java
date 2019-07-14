package service.connectservice;

import mapper.connectmapper.SPAMapper;
import mapper.connectmapper.SPMapper;
import mapper.entitymapper.CopyrightMapper;
import mapper.entitymapper.ProgramMapper;
import mapper.entitymapper.ScientistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Copyright;
import table.entity.Program;
import table.entity.Scientist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SPService {

    @Autowired
    private SPMapper spMapper;

    @Autowired
    private ScientistMapper scientistMapper;

    @Autowired
    private ProgramMapper programMapper;

    private Map<String,String> map;

    public void insert(String sno,String pno) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("Pno",pno);
        spMapper.insert(map);
    }

    public void delete(String sno,String pno) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("Pno",pno);
        spMapper.delete(map);
    }

    public List<Program> selectPno(String sno) {

        List<String> list = spMapper.selectPno(sno);
        List<Program> plist = new ArrayList<Program>();
        for(String pno : list) {

            map = new HashMap<String,String>();
            map.put("Pno_t",pno);
            Program temp = programMapper.select(map).get(0);
            plist.add(temp);
        }
        return plist;
    }

    public List<Scientist> selectSno(String pno) {

        List<String> list = spMapper.selectSno(pno);
        List<Scientist> slist = new ArrayList<Scientist>();
        for(String sno : list) {

            map = new HashMap<String,String>();
            map.put("Sno_t",sno);
            Scientist temp = scientistMapper.select(map).get(0);
            slist.add(temp);
        }
        return slist;
    }
}
