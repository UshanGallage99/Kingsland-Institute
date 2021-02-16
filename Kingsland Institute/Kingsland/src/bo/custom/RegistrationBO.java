package bo.custom;

import dto.RegistrationDTO;

import java.util.ArrayList;

public interface RegistrationBO {
    public boolean saveRegistration(RegistrationDTO dto)throws Exception;
    public RegistrationDTO getRegistration(String id)throws Exception;
    public ArrayList<RegistrationDTO> getAllRegistration()throws Exception;
    public String getId()throws Exception;

}
