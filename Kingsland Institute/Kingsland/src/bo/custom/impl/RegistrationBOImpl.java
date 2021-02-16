package bo.custom.impl;

import bo.custom.RegistrationBO;
import dto.RegistrationDTO;

import java.util.ArrayList;

public class RegistrationBOImpl implements RegistrationBO {
    @Override
    public boolean saveRegistration(RegistrationDTO dto) throws Exception {
        return false;
    }

    @Override
    public RegistrationDTO getRegistration(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<RegistrationDTO> getAllRegistration() throws Exception {
        return null;
    }

    @Override
    public String getId() throws Exception {
        return null;
    }
}
