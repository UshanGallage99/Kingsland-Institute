package bo.custom.impl;

import bo.custom.StudentBO;
import dao.DAOFactory;
import dao.QueryDAO;
import dto.StudentDTO;
import entity.Student;
import dao.custom.StudentDAO;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    private StudentDAO dao= DAOFactory.getInstance()
            .getDAO(DAOFactory.DAOType.STUDENT);
    private QueryDAO qDao= DAOFactory.getInstance()
            .getDAO(DAOFactory.DAOType.QUERY);
    @Override
    public boolean saveStudent(StudentDTO dto) throws Exception {
        return dao.save(new Student(dto.getId(),
                dto.getStudentName(),dto.getAddress(),dto.getContact(),dto.getDob(),dto.getGender()));
    }

    @Override
    public boolean deleteStudent(String id) throws Exception {
        return false;
    }

    @Override
    public StudentDTO getStudent(String id) throws Exception {
        Student s=dao.get(id);
        return new StudentDTO(s.getId(),
                s.getStudentName(),s.getAddress(),s.getContact(),s.getDob(),s.getGender());
    }

    @Override
    public ArrayList<StudentDTO> getAllStudent() throws Exception {
        /*List<Student> cList=dao.getAll();
        ArrayList<StudentDTO> dtoList= new ArrayList();
        for (Student s : cList) {
            dtoList.add(new StudentDTO(s.getId(),s.getStudentName(),s.getAddress(),s.getContact(),s.getDob(),s.getGender()));
        }
        return dtoList;*/
        return null;
    }

     @Override
    public String getId() throws Exception {
         //return qDao.getId();
         return null;
    }
}
