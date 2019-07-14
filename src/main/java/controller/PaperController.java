package controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.connectservice.APAService;
import service.connectservice.SPAService;
import service.entityservice.PaperService;
import table.entity.Paper;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class PaperController {

    @Autowired
    private PaperService paperService;

    @Autowired
    private SPAService spaService;

    @Autowired
    private APAService apaService;

    public static final String SELECT = "paper/paper";

    @RequestMapping("/paper")
    public String paper(HttpServletRequest httpServletRequest) {

        Map<String,String> map = MapUtil.turn(httpServletRequest.getParameterMap());
        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        httpServletRequest.setAttribute("flag","paper");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Paper> palist = paperService.select(map);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = palist.size();
                for(int i=0;i<10-temp;++i) palist.add(null);
                httpServletRequest.setAttribute("palist",palist);
                return SELECT;

            case "insert":

                paperService.insert(map);
                return MapUtil.UPDATE;

            case "update":

                paperService.update(map);
                return MapUtil.UPDATE;

            case "delete":

                paperService.delete((String)map.get("P_Ano"));
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/pas")
    public String pas(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String sno = httpServletRequest.getParameter("Sno");
        String sname = httpServletRequest.getParameter("Sname");
        httpServletRequest.setAttribute("Sno",sno);
        httpServletRequest.setAttribute("Sname",sname);
        String pano;

        httpServletRequest.setAttribute("flag","pas");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Paper> palist = spaService.selectPano(sno);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = palist.size();
                for(int i=0;i<10-temp;++i) palist.add(null);
                httpServletRequest.setAttribute("palist",palist);
                return SELECT;

            case "insert":

                pano = httpServletRequest.getParameter("P_Ano");
                spaService.insert(sno,pano);
                return MapUtil.UPDATE;

            case "delete":

                pano = httpServletRequest.getParameter("P_Ano");
                spaService.delete(sno,pano);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/paa")
    public String paa(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String ano = httpServletRequest.getParameter("Ano");
        String aname = httpServletRequest.getParameter("Aname");
        httpServletRequest.setAttribute("Ano",ano);
        httpServletRequest.setAttribute("Aname",aname);
        String pano;

        httpServletRequest.setAttribute("flag","paa");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Paper> palist = apaService.selectPano(ano);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = palist.size();
                for(int i=0;i<10-temp;++i) palist.add(null);
                httpServletRequest.setAttribute("palist",palist);
                return SELECT;

            case "insert":

                pano = httpServletRequest.getParameter("P_Ano");
                apaService.insert(ano,pano);
                return MapUtil.UPDATE;

            case "delete":

                pano = httpServletRequest.getParameter("P_Ano");
                apaService.delete(ano,pano);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    public static int judge(HttpServletRequest httpServletRequest) {

        httpServletRequest.setAttribute(
                "P_Ano_t",httpServletRequest.getParameter("P_Ano_t"));
        httpServletRequest.setAttribute(
                "P_Aname_t",httpServletRequest.getParameter("P_Aname_t"));
        httpServletRequest.setAttribute(
                "P_Amajor_t",httpServletRequest.getParameter("P_Amajor_t"));
        httpServletRequest.setAttribute(
                "P_Apublic_t",httpServletRequest.getParameter("P_Apublic_t"));
        httpServletRequest.setAttribute(
                "P_Atime_t",httpServletRequest.getParameter("P_Atime_t"));
        httpServletRequest.setAttribute(
                "P_Aquote_t",httpServletRequest.getParameter("P_Aquote_t"));

        int index;
        if (httpServletRequest.getParameter("index")==null) index=1;
        else if (httpServletRequest.getParameter("index")=="") index=1;
        else index=Integer.parseInt(httpServletRequest.getParameter("index"));
        return index;
    }
}
