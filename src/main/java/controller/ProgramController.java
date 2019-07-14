package controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.connectservice.SPService;
import service.entityservice.ProgramService;
import table.entity.Program;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @Autowired
    private SPService spService;

    public static final String SELECT = "program/program";

    @RequestMapping("/program")
    public String program(HttpServletRequest httpServletRequest) {

        Map<String,String> map = MapUtil.turn(httpServletRequest.getParameterMap());
        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        httpServletRequest.setAttribute("flag","program");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Program> plist = programService.select(map);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = plist.size();
                for(int i=0;i<10-temp;++i) plist.add(null);
                httpServletRequest.setAttribute("plist",plist);
                return SELECT;

            case "insert":

                programService.insert(map);
                return MapUtil.UPDATE;

            case "update":

                programService.update(map);
                return MapUtil.UPDATE;

            case "delete":

                programService.delete((String)map.get("Pno"));
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    @RequestMapping("/ps")
    public String ps(HttpServletRequest httpServletRequest) {

        String request = httpServletRequest.getParameter("request");
        httpServletRequest.setAttribute("request",request);
        String sno = httpServletRequest.getParameter("Sno");
        String sname = httpServletRequest.getParameter("Sname");
        httpServletRequest.setAttribute("Sno",sno);
        httpServletRequest.setAttribute("Sname",sname);

        String pno;

        httpServletRequest.setAttribute("flag","ps");

        switch (request) {

            case "select":

                int index=judge(httpServletRequest);
                httpServletRequest.setAttribute("index",index);
                Page page = PageHelper.startPage(index,10);
                List<Program> plist = spService.selectPno(sno);
                httpServletRequest.setAttribute("page",page.getPages()==0?1:page.getPages());
                int temp = plist.size();
                for(int i=0;i<10-temp;++i) plist.add(null);
                httpServletRequest.setAttribute("plist",plist);
                return SELECT;

            case "insert":

                pno = httpServletRequest.getParameter("Pno");
                spService.insert(sno,pno);
                return MapUtil.UPDATE;

            case "delete":

                pno = httpServletRequest.getParameter("Pno");
                spService.delete(sno,pno);
                return MapUtil.UPDATE;
        }

        return MapUtil.UPDATE;
    }

    public static int judge(HttpServletRequest httpServletRequest) {

        httpServletRequest.setAttribute(
                "Pno_t",httpServletRequest.getParameter("Pno_t"));
        httpServletRequest.setAttribute(
                "Pname_t",httpServletRequest.getParameter("Pname_t"));
        httpServletRequest.setAttribute(
                "Plevel_t",httpServletRequest.getParameter("Plevel_t"));
        httpServletRequest.setAttribute(
                "Ptype_t",httpServletRequest.getParameter("Ptype_t"));
        httpServletRequest.setAttribute(
                "Pmajor_t",httpServletRequest.getParameter("Pmajor_t"));
        httpServletRequest.setAttribute(
                "Pinfo_start_t",httpServletRequest.getParameter("Pinfo_start_t"));
        httpServletRequest.setAttribute(
                "Pinfo_end_t",httpServletRequest.getParameter("Pinfo_end_t"));
        httpServletRequest.setAttribute(
                "Pinfo_corporate_t",httpServletRequest.getParameter("Pinfo_corporate_t"));

        int index;
        if (httpServletRequest.getParameter("index")==null) index=1;
        else if (httpServletRequest.getParameter("index")=="") index=1;
        else index=Integer.parseInt(httpServletRequest.getParameter("index"));
        return index;
    }
}
