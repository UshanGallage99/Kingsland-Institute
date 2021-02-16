package bo.custom.impl;

import bo.custom.CourseBO;
import dto.CourseDTO;

import java.util.ArrayList;

public class CourseBOImpl implements CourseBO {
    @Override
    public boolean saveCourse(CourseDTO dto) throws Exception {
        return false;
    }

    @Override
    public CourseDTO getCourse(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CourseDTO> getAllCourse() throws Exception {
        return null;
    }

    @Override
    public String getId() throws Exception {
        return null;
    }
}
