package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.StudentDAO;
import dto.StudentDTO;
import entity.Student;
import dao.custom.StudentDAO;

import java.sql.ResultSet;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public boolean save(Student student) throws Exception {
        return CrudUtil.execute
                ("INSERT INTO Student VALUES(?,?,?,?,?,?)",
                        student.getId(),student.getStudentName(),
                        student.getAddress(),student.getContact(),student.getDob(),student.getGender());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Student get(String s) throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Student WHERE ID=?",s);
        if (resultSet.next()) {
            return new Student(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getDouble(6));
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getAll() throws Exception {
        return null;
    }
}
