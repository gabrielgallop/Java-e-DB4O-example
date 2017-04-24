/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;


import DAO.PacienteDAO;
import Classes.Paciente;
import java.util.List;

/**
 *
 * @author FagnerRoger
 */
public class PacienteManager {

    public PacienteDAO pacienteDAO;
    
    public PacienteManager() {
        pacienteDAO = new PacienteDAO();
    }
    
    public void create(Paciente paciente) {
        pacienteDAO.create(paciente);
    }
    
    public void edit(Paciente paciente,Paciente oldPaciente) {
        pacienteDAO.edit(paciente,oldPaciente);
    }
    
    public void destroy(Paciente idPaciente) {
        pacienteDAO.destroy(idPaciente);
    }
    
    public List<Paciente> getALL() {
        return pacienteDAO.getALL();
    }
    
    public List<Paciente> filtrarPorCPF(String cpf) {
        return pacienteDAO.filtrarPorCPF(cpf);
    }
      
    
}
