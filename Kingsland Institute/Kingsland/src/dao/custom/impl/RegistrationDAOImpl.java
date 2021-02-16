package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.RegistrationDAO;
import entity.Registration;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDAOImpl implements RegistrationDAO {
    @Override
    public boolean save(Registration registration) throws Exception {
            return CrudUtil.execute
                    ("INSERT INTO Registration VALUES(?,?,?,?,?)",
                            registration.getRegNo(), registration.getRegDate(),
                            registration.getRegFee(), registration.getsID(), registration.getcCode());

    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Registration get(String s) throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Registraion  WHERE regNo=?",s);
        if (resultSet.next()) {
            return new Registration(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getDouble(3),
                    resultSet.getString(4),
                    resultSet.getString(5));
        } else {
            return null;
        }
    }

    @Override
    public List<Registration> getAll() throws Exception {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Customer");
        ArrayList<Registration> customerList = new ArrayList<>();
        while (resultSet.next()) {
            customerList.add(
                    new Registration(
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getDouble(4)
                    )
            );
        }
        return customerList;
    }
    }

