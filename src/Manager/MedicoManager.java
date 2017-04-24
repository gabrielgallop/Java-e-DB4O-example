/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.MedicoDAO;
import Classes.Medico;
import java.util.List;

/**
 *
 * @author FagnerRoger
 */
public class MedicoManager {

    public MedicoDAO medicoDAO;

    public MedicoManager() {
        medicoDAO = new MedicoDAO();
    }

    public void create(Medico medico) {
        medicoDAO.create(medico);
    }

    public void edit(Medico medico,Medico oldMedico) {
        medicoDAO.edit(medico,oldMedico);
    }

    public void destroy(Medico idMedico) {
        medicoDAO.destroy(idMedico);
    }

    public List<Medico> getALL() {
        return medicoDAO.getALL();
    }

    public List<Medico> filtrarPorCPF(String nome) {
        return medicoDAO.filtrarPorCPF(nome);
    }

}
