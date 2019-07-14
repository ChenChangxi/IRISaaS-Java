package controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.connectservice.*;
import service.entityservice.ScientistService;
import table.entity.Scientist;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class ScientistController {

    @Autowired
    private ScientistService scientistService;

    @Autowired
    private SAService saService;

    @Autowired
    private SCService scService;

    @Autowired
    private SPService spService;

    @Autowired
    private SPAService spaService;

    public static final String SELECT = "scientist/scientist";

    @RequestMapping("/scientist")
    public String scientist(HttpServletRequest httpServletRequest) {

        Map<String,String> map = MapUtil.turn(httpServletRequest.getParameterMap());
        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        httpServletRequest.setAttribute("flag","scientist");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Scientist> slist = scientistService.select(map);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = slist.size();
                for(int i=0;i<10-temp;++i) slist.add(null);
                httpServletRequest.setAttribute("slist",slist);
                return SELECT;

            case "insert":

                scientistService.insert(map);
                return MapUtil.UPDATE;

            case "update":

                scientistService.update(map);
                return MapUtil.UPDATE;

            case "delete":

                scientistService.delete((String)map.get("Sno"));
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/sa")
    public String sa(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String ano = httpServletRequest.getParameter("Ano");
        String aname = httpServletRequest.getParameter("Aname");
        httpServletRequest.setAttribute("Ano",ano);
        httpServletRequest.setAttribute("Aname",aname);
        String sno;

        httpServletRequest.setAttribute("flag","sa");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Scientist> slist = saService.selectSno(ano);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = slist.size();
                for(int i=0;i<10-temp;++i) slist.add(null);
                httpServletRequest.setAttribute("slist",slist);
                return SELECT;

            case "insert":

                sno = httpServletRequest.getParameter("Sno");

                System.out.println(sno);

                saService.insert(sno,ano);
                return MapUtil.UPDATE;

            case "delete":

                sno = httpServletRequest.getParameter("Sno");
                saService.delete(sno,ano);
                return MapUtil.UPDATE;
        }

        System.out.println("fuckoff");

        return MapUtil.UPDATE;
    }

    @RequestMapping("/sc")
    public String sc(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String cno = httpServletRequest.getParameter("Cno");
        String cname = httpServletRequest.getParameter("Cname");
        httpServletRequest.setAttribute("Cno",cno);
        httpServletRequest.setAttribute("Cname",cname);
        String sno;

        httpServletRequest.setAttribute("flag","sc");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Scientist> slist = scService.selectSno(cno);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = slist.size();
                for(int i=0;i<10-temp;++i) slist.add(null);
                httpServletRequest.setAttribute("slist",slist);
                return SELECT;

            case "insert":

                sno = httpServletRequest.getParameter("Sno");
                scService.insert(sno,cno);
                return MapUtil.UPDATE;

            case "delete":

                sno = httpServletRequest.getParameter("Sno");
                scService.delete(sno,cno);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/spa")
    public String spa(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String pano = httpServletRequest.getParameter("P_Ano");
        String pname = httpServletRequest.getParameter("P_Aname");
        httpServletRequest.setAttribute("P_Ano",pano);
        httpServletRequest.setAttribute("P_Aname",pname);

        String sno;

        httpServletRequest.setAttribute("flag","spa");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Scientist> slist = spaService.selectSno(pano);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = slist.size();
                for(int i=0;i<10-temp;++i) slist.add(null);
                httpServletRequest.setAttribute("slist",slist);
                return SELECT;

            case "insert":

                sno = httpServletRequest.getParameter("Sno");
                spaService.insert(sno,pano);
                return MapUtil.UPDATE;

            case "delete":

                sno = httpServletRequest.getParameter("Sno");
                spaService.delete(sno,pano);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/sp")
    public String sp(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String pno = httpServletRequest.getParameter("Pno");
        String pname = httpServletRequest.getParameter("Pname");
        httpServletRequest.setAttribute("Pno",pno);
        httpServletRequest.setAttribute("Pname",pname);
        String sno;

        httpServletRequest.setAttribute("flag","sp");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Scientist> slist = spService.selectSno(pno);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = slist.size();
                for(int i=0;i<10-temp;++i) slist.add(null);
                httpServletRequest.setAttribute("slist", slist);
                return SELECT;

            case "insert":

                sno = httpServletRequest.getParameter("Sno");
                spService.insert(sno, pno);
                return MapUtil.UPDATE;

            case "delete":

                sno = httpServletRequest.getParameter("Sno");
                spService.delete(sno, pno);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    public static int judge(HttpServletRequest httpServletRequest) {

        httpServletRequest.setAttribute(
                "Sno_t",httpServletRequest.getParameter("Sno_t"));
        httpServletRequest.setAttribute(
                "Sname_t",httpServletRequest.getParameter("Sname_t"));
        httpServletRequest.setAttribute(
                "Sage_t",httpServletRequest.getParameter("Sage_t"));
        httpServletRequest.setAttribute(
                "Sdept_t",httpServletRequest.getParameter("Sdept_t"));
        httpServletRequest.setAttribute(
                "Smaj_t",httpServletRequest.getParameter("Smaj_t"));
        httpServletRequest.setAttribute(
                "Ssex_t",httpServletRequest.getParameter("Ssex_t"));
        httpServletRequest.setAttribute(
                "Spro_t",httpServletRequest.getParameter("Spro_t"));

        int index;
        if (httpServletRequest.getParameter("index")==null ) index=1;
        else if (httpServletRequest.getParameter("index")=="") index=1;
        else index=Integer.parseInt(httpServletRequest.getParameter("index"));
        return index;
    }
}
