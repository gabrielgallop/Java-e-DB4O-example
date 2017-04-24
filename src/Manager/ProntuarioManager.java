/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.ProntuarioDAO;
import Classes.Prontuario;
import java.util.List;

/**
 *
 * @author FagnerRoger
 */
public class ProntuarioManager {

    public ProntuarioDAO prontuarioDAO;

    public ProntuarioManager() {
        prontuarioDAO = new ProntuarioDAO();
    }

    public void create(Prontuario prontuario) {
        prontuarioDAO.create(prontuario);
    }

    public void edit(Prontuario prontuario,Prontuario oldProntuario) {
        prontuarioDAO.edit(prontuario,oldProntuario);
    }

    public void destroy(Prontuario idProntuario) {
        prontuarioDAO.destroy(idProntuario);
    }

    public List<Prontuario> getALL() {
        return prontuarioDAO.getALL();
    }

    public List<Prontuario> filtrarPorCPF(String nome) {
        return prontuarioDAO.filtrarPorCPF(nome);
    }

}
