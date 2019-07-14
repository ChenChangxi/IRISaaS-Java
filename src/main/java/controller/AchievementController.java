package controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.connectservice.APAService;
import service.connectservice.SAService;
import service.entityservice.AchievementService;
import table.entity.Achievement;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.List;
import java.util.Map;

@Controller
public class AchievementController {

    @Autowired
    private AchievementService achievementService;

    @Autowired
    private APAService apaService;

    @Autowired
    private SAService saService;

    public static final String SELECT = "achievement/achievement";

    @RequestMapping("/achievement")
    public String achievement(HttpServletRequest httpServletRequest) {

        Map<String,String> map = MapUtil.turn(httpServletRequest.getParameterMap());
        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        httpServletRequest.setAttribute("flag","achievement");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Achievement> alist = achievementService.select(map);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = alist.size();
                for(int i=0;i<10-temp;++i) alist.add(null);
                httpServletRequest.setAttribute("alist",alist);
                return SELECT;

            case "insert":

                achievementService.insert(map);
                return MapUtil.UPDATE;

            case "update":

                achievementService.update(map);
                return MapUtil.UPDATE;

            case "delete":

                achievementService.delete((String)map.get("Ano"));
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/as")
    public String as(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String sno = httpServletRequest.getParameter("Sno");
        String sname = httpServletRequest.getParameter("Sname");
        httpServletRequest.setAttribute("Sno",sno);
        httpServletRequest.setAttribute("Sname",sname);
        String ano;

        httpServletRequest.setAttribute("flag","as");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Achievement> alist = saService.selectAno(sno);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = alist.size();
                for(int i=0;i<10-temp;++i) alist.add(null);
                httpServletRequest.setAttribute("alist",alist);
                return SELECT;

            case "insert":

                ano = httpServletRequest.getParameter("Ano");
                saService.insert(sno,ano);
                return MapUtil.UPDATE;

            case "delete":

                ano = httpServletRequest.getParameter("Ano");
                saService.delete(sno,ano);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/apa")
    public String apa(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String pano = httpServletRequest.getParameter("P_Ano");
        String pname = httpServletRequest.getParameter("P_Aname");
        httpServletRequest.setAttribute("P_Ano",pano);
        httpServletRequest.setAttribute("P_Aname",pname);
        String ano;

        httpServletRequest.setAttribute("flag","apa");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Achievement> alist = apaService.selectAno(pano);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = alist.size();
                for(int i=0;i<10-temp;++i) alist.add(null);
                httpServletRequest.setAttribute("alist",alist);
                return SELECT;

            case "insert":

                ano = httpServletRequest.getParameter("Ano");
                apaService.insert(pano,ano);
                return MapUtil.UPDATE;

            case "delete":

                ano = httpServletRequest.getParameter("Ano");
                apaService.delete(pano,ano);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    public static int judge(HttpServletRequest httpServletRequest) {

        httpServletRequest.setAttribute(
                "Ano_t",httpServletRequest.getParameter("Ano_t"));
        httpServletRequest.setAttribute(
                "Aname_t",httpServletRequest.getParameter("Aname_t"));
        httpServletRequest.setAttribute(
                "Aidentify_t",httpServletRequest.getParameter("Aidentify_t"));
        httpServletRequest.setAttribute(
                "Aaward_t",httpServletRequest.getParameter("Aaward_t"));
        httpServletRequest.setAttribute(
                "Atransform_t",httpServletRequest.getParameter("Atransform_t"));
        httpServletRequest.setAttribute(
                "Apatent_t",httpServletRequest.getParameter("Apatent_t"));

        int index;
        if (httpServletRequest.getParameter("index")==null) index=1;
        else if (httpServletRequest.getParameter("index")=="") index=1;
        else index=Integer.parseInt(httpServletRequest.getParameter("index"));
        return index;
    }
}
