package controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.connectservice.SCService;
import service.entityservice.CopyrightService;
import table.entity.Copyright;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class CopyrightController {

    @Autowired
    private CopyrightService copyrightService;

    @Autowired
    private SCService scService;

    public static final String SELECT = "copyright/copyright";

    @RequestMapping("/copyright")
    public String copyright(HttpServletRequest httpServletRequest) {

        Map<String,String> map = MapUtil.turn(httpServletRequest.getParameterMap());
        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        httpServletRequest.setAttribute("flag","copyright");

        switch (request) {

            case "select":

                System.out.println("fuck");

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Copyright> clist = copyrightService.select(map);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = clist.size();
                for(int i=0;i<10-temp;++i) clist.add(null);
                httpServletRequest.setAttribute("clist",clist);
                return SELECT;

            case "insert":

                copyrightService.insert(map);
                return MapUtil.UPDATE;

            case "update":

                copyrightService.update(map);
                return MapUtil.UPDATE;

            case "delete":

                copyrightService.delete((String)map.get("Cno"));
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/cs")
    public String as(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String sno = httpServletRequest.getParameter("Sno");
        String sname = httpServletRequest.getParameter("Sname");
        httpServletRequest.setAttribute("Sno",sno);
        httpServletRequest.setAttribute("Sname",sname);
        String cno;

        httpServletRequest.setAttribute("flag","cs");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Copyright> clist = scService.selectCno(sno);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = clist.size();
                for(int i=0;i<10-temp;++i) clist.add(null);
                httpServletRequest.setAttribute("clist",clist);
                return SELECT;

            case "insert":

                cno = httpServletRequest.getParameter("Cno");
                scService.insert(sno,cno);
                return MapUtil.UPDATE;

            case "delete":

                cno = httpServletRequest.getParameter("Cno");
                scService.delete(sno,cno);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    public static int judge(HttpServletRequest httpServletRequest) {

        httpServletRequest.setAttribute(
                "Cno_t",httpServletRequest.getParameter("Cno_t"));
        httpServletRequest.setAttribute(
                "Cname_t",httpServletRequest.getParameter("Cname_t"));
        httpServletRequest.setAttribute(
                "Cmajor_t",httpServletRequest.getParameter("Cmajor_t"));
        httpServletRequest.setAttribute(
                "Ctype_t",httpServletRequest.getParameter("Ctype_t"));
        httpServletRequest.setAttribute(
                "Ctime_t",httpServletRequest.getParameter("Ctime_t"));
        httpServletRequest.setAttribute(
                "Cquote_t",httpServletRequest.getParameter("Cquote_t"));

        int index;
        if (httpServletRequest.getParameter("index")==null) index=1;
        else if (httpServletRequest.getParameter("index")=="") index=1;
        else index=Integer.parseInt(httpServletRequest.getParameter("index"));
        return index;
    }
}
