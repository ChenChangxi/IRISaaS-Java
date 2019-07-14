package service.connectservice;


import mapper.connectmapper.SPAMapper;
import mapper.entitymapper.CopyrightMapper;
import mapper.entitymapper.PaperMapper;
import mapper.entitymapper.ScientistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Copyright;
import table.entity.Paper;
import table.entity.Scientist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SPAService {

    @Autowired
    private SPAMapper spaMapper;

    @Autowired
    private ScientistMapper scientistMapper;

    @Autowired
    private PaperMapper paperMapper;

    private Map<String,String> map;

    public void insert(String sno,String pano) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("P_Ano",pano);
        spaMapper.insert(map);
    }

    public void delete(String sno,String pano) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("P_Ano",pano);
        spaMapper.delete(map);
    }

    public List<Paper> selectPano(String sno) {

        List<String> list = spaMapper.selectPano(sno);
        List<Paper> palist = new ArrayList<Paper>();
        for(String pano : list) {

            map = new HashMap<String,String>();
            map.put("P_Ano_t",pano);
            Paper temp = paperMapper.select(map).get(0);
            palist.add(temp);
        }
        return palist;
    }

    public List<Scientist> selectSno(String pano) {

        List<String> list = spaMapper.selectSno(pano);
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
