package dao.custom.impl;

import dao.custom.CourseDAO;
import dto.CourseDTO;
import entity.Course;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public boolean save(Course course) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Course get(String s) throws Exception {
        return null;
    }

    @Override
    public List<Course> getAll() throws Exception {
        return null;
    }
}
