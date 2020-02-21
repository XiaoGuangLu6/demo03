package cm.itcast.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class demo01 {

    //分支注释
    @RequestMapping("/demo01")
    @ResponseBody
    public String demo01(){
        return "springboot54545";
    }
}
