package service.connectservice;

import mapper.connectmapper.SAMapper;
import mapper.entitymapper.AchievementMapper;
import mapper.entitymapper.ScientistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Achievement;
import table.entity.Paper;
import table.entity.Scientist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SAService {

    @Autowired
    private SAMapper saMapper;

    @Autowired
    private ScientistMapper scientistMapper;

    @Autowired
    private AchievementMapper achievementMapper;

    private Map<String,String> map;

    public void insert(String sno,String ano) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("Ano",ano);
        saMapper.insert(map);
    }

    public void delete(String sno,String ano) {

        map = new HashMap<String,String>();
        map.put("Sno",sno);
        map.put("Ano",ano);
        saMapper.delete(map);
    }

    public List<Scientist> selectSno(String ano) {

        List<String> list = saMapper.selectSno(ano);
        List<Scientist> slist = new ArrayList<Scientist>();
        for(String sno : list) {

            map = new HashMap<String,String>();
            map.put("Sno_t",sno);
            Scientist temp = scientistMapper.select(map).get(0);
            slist.add(temp);
        }
        return slist;
    }

    public List<Achievement> selectAno(String sno) {

        List<String> list = saMapper.selectAno(sno);
        List<Achievement> alist = new ArrayList<Achievement>();
        for(String ano : list) {

            map = new HashMap<String,String>();
            map.put("Ano_t",ano);
            Achievement temp = achievementMapper.select(map).get(0);
            alist.add(temp);
        }
        return alist;
    }
}