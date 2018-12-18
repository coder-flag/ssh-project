package example.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redict(){

        return "redirect: /home/index";

    }

    @RequestMapping(value ="{aaa}")
    public String template_s(Model model,
                             @PathVariable(value = "aaa") String aaa){

        model.addAttribute("aaa",aaa);
        return "documentView";
    }

//    @RequestMapping(value ="/bbb/{sitePrefix}/{language}/document/{id}/{naturalText} ")
//    public String template(Model model,
//                           @PathVariable(value = "sitePrefix") String sitePrefix,
//                           @PathVariable(value = "language") String language,
//                           @PathVariable(value = "id") Long id,
//                           @PathVariable(value = "naturalText") String naturalText){
//
//        model.addAttribute("sitePrefix" ,sitePrefix);
//        model.addAttribute("language" ,language);
//        model.addAttribute("id" ,id);
//        model.addAttribute("naturalText", naturalText);
//
//        String documentName = "java";
//        if(id == 8000){
//            documentName = "spring";
//        }
//
//        model.addAttribute("documentName",documentName);
//        return "documentView";
//
//    }

}
