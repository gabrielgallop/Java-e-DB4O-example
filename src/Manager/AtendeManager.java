/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import DAO.AtendeDAO;
import Classes.Atende;
import java.util.List;

/**
 *
 * @author FagnerRoger
 */
public class AtendeManager {

    public AtendeDAO atendeDAO;

    public AtendeManager() {
        atendeDAO = new AtendeDAO();
    }

    public void create(Atende atende) {
        atendeDAO.create(atende);
    }

    public void edit(Atende atende,Atende oldAtende) {
        atendeDAO.edit(atende,oldAtende);
    }

    public void destroy(Atende idAtende) {
        atendeDAO.destroy(idAtende);
    }

    public List<Atende> getALL() {
        return atendeDAO.getALL();
    }

    public List<Atende> filtrarPorCPF(String nome) {
        return atendeDAO.filtrarPorCPF(nome);
    }

}
