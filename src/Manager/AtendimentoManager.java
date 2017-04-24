/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.AtendimentoDAO;
import Classes.Atendimento;
import java.util.List;

/**
 *
 * @author FagnerRoger
 */
public class AtendimentoManager {

    public AtendimentoDAO atendimentoDAO;

    public AtendimentoManager() {
        atendimentoDAO = new AtendimentoDAO();
    }

    public void create(Atendimento atendimento) {
        atendimentoDAO.create(atendimento);
    }

    public void edit(Atendimento atendimento,Atendimento oldAtendimento) {
        atendimentoDAO.edit(atendimento,oldAtendimento);
    }

    public void destroy(Atendimento idAtendimento) {
        atendimentoDAO.destroy(idAtendimento);
    }

    public List<Atendimento> getALL() {
        return atendimentoDAO.getALL();
    }

    public List<Atendimento> filtrarPorCPF(String nome) {
        return atendimentoDAO.filtrarPorCPF(nome);
    }

}
