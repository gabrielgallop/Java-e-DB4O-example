/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;

/**
 *
 * @author Fagner
 */
public class Atendimento {
    
    private List<Atende> listAtende;
    
    private List<Solicita> listaSolicitacao;

    public List<Solicita> getListaSolicitacao() {
        return listaSolicitacao;
    }

    public void setListaSolicitacao(List<Solicita> listaSolicitacao) {
        this.listaSolicitacao = listaSolicitacao;
    }      

    public List<Atende> getListAtende() {
        return listAtende;
    }

    public void setListAtende(List<Atende> listAtende) {
        this.listAtende = listAtende;
    }

   
    
    
}
