package entity;

public class Course implements SuperEntity{
    private String code;
    private String courseName;
    private String courseType;
    private String duration;

    public Course() {
    }

    public Course(String code, String courseName, String courseType, String duration) {
        this.setCode(code);
        this.setCourseName(courseName);
        this.setCourseType(courseType);
        this.setDuration(duration);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
