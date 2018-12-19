package example.Service;


import example.model.*;

import org.springframework.stereotype.Service;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:49 2018/12/19
 * @Modified By:
 **/
@Service
public interface CourseService {

    public Course getCoursebyId(Integer courseId);

}
