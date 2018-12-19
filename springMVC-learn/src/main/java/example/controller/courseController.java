package example.controller;

import example.Service.CourseService;
import example.model.Course;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 17:12 2018/12/19
 * @Modified By:
 **/

@Controller
@RequestMapping("/courses")
public class courseController {


    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //负责处理/courses/view?courseId=123
    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId , Model model){

        Course course = courseService.getCoursebyId(courseId);
        model.addAttribute("course",course) ;

        return "course_overview";
    }

    //负责处理/courses/view2/{courseId}
    @RequestMapping("/view/{courseId}")
    public String viewCourse2(@PathVariable("courseId") Integer courseId, Map<String,Object> model){

        Course course = courseService.getCoursebyId(courseId);
        model.put("course",course) ;
        return "course_overview";
    }

    //负责处理/courses/view3?courseId=123
    @RequestMapping("/view3")
    public String viewCourse3(HttpServletRequest request){
        Integer courseId = Integer.valueOf(request.getParameter("courseId"));
        Course course = courseService.getCoursebyId(courseId);
        request.setAttribute("course",course);

        return "course_overview";
    }

    //负责处理/courses/view2/{title}
    @RequestMapping("/view2/{title}")
    public String viewCourse4(@PathVariable("title") String title, Map<String,Object> model){

        Course course = courseService.getCoursebyId(123);
        course.setTitle(title);
        model.put("course",course) ;
        return "course_overview";
    }

    //文件夹下文件返回写法
    //jsp页面上的控件name属性的值 应当与模型里的属性的名称相同，
    @RequestMapping(value = "/admin", method = RequestMethod.GET,params ="add")
    public String createCourse(){
        return "course_admin/edit";
    }


    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    public String doSave(Course course){

        //在这进行业务操作，比如数据库持久化
        course.setTitle("SpringMVC-learning");

        return "redirect:view2/" + course.getTitle();
    }

}
