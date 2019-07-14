package service.connectservice;


import mapper.connectmapper.SCMapper;
import mapper.entitymapper.CopyrightMapper;
import mapper.entitymapper.ScientistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Achievement;
import table.entity.Copyright;
import table.entity.Paper;
import table.entity.Scientist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SCService {

    @Autowired
    private SCMapper scMapper;

    @Autowired
    private ScientistMapper scientistMapper;

    @Autowired
    private CopyrightMapper copyrightMapper;

    private Map<String,String> map;

    public void insert(String sno,String cno) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("Cno",cno);
        scMapper.insert(map);
    }

    public void delete(String sno,String cno) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("Cno",cno);
        scMapper.delete(map);
    }

    public List<Copyright> selectCno(String sno) {

        List<String> list = scMapper.selectCno(sno);
        List<Copyright> clist = new ArrayList<Copyright>();
        for(String cno : list) {

            map = new HashMap<String,String>();
            map.put("Cno_t",cno);
            Copyright temp = copyrightMapper.select(map).get(0);
            clist.add(temp);
        }
        return clist;
    }

    public List<Scientist> selectSno(String cno) {

        List<String> list = scMapper.selectSno(cno);
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
