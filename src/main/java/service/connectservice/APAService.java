package service.connectservice;

import mapper.connectmapper.APAMapper;
import mapper.entitymapper.AchievementMapper;
import mapper.entitymapper.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import table.entity.Achievement;
import table.entity.Paper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class APAService {

    @Autowired
    private APAMapper apaMapper;

    @Autowired
    private AchievementMapper achievementMapper;

    @Autowired
    private PaperMapper paperMapper;

    private Map<String,String> map;

    public void insert(String ano,String pano) {

        map = new HashMap<String,String>();
        map.put("Ano",ano);
        map.put("P_Ano",pano);
        map.put(ano,pano);
        apaMapper.insert(map);
    }

    public void delete(String ano,String pano) {

        map = new HashMap<String,String>();
        map.put("Ano",ano);
        map.put("P_Ano",pano);
        apaMapper.delete(map);
    }

    public List<Achievement> selectAno(String pano) {

        List<String> list = apaMapper.selectAno(pano);
        List<Achievement> alist = new ArrayList<Achievement>();
        for(String ano : list) {

            map = new HashMap<String,String>();
            map.put("Ano_t",ano);
            Achievement temp = achievementMapper.select(map).get(0);
            alist.add(temp);
        }
        return alist;
    }

    public List<Paper> selectPano(String ano) {

        List<String> list = apaMapper.selectPano(ano);
        List<Paper> palist = new ArrayList<Paper>();
        for(String pano : list) {

            map = new HashMap<String,String>();
            map.put("P_Ano_t",pano);
            Paper temp = (Paper)paperMapper.select(map).get(0);
            palist.add(temp);
        }
        return palist;
    }
}
