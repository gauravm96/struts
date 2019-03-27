package org.superbiz.struts;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index extends ActionSupport {

    @RequestMapping("/")
    public String index(){
        return "/index.jsp";
    }
}
