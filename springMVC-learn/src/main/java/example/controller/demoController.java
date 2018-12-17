package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 22:54 2018/12/17
 * @Modified By:
 **/
@Controller
@RequestMapping("/home")
public class demoController {


    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

}
