package example.model;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 16:47 2018/12/19
 * @Modified By:
 **/
public class Chapter {

    private Integer id;
    private Integer courseId;
    private Integer order;
    private String title;
    private String descr;

//    private List<Section> sectionList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
