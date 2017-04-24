/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Fagner
 */
public class Prontuario {
    
    private List<Anamnese> listaAnamnese;
    private List<Solicita> listaSolicita;

    public List<Anamnese> getListaAnamnese() {
        return listaAnamnese;
    }

    public void setListaAnamnese(List<Anamnese> listaAnamnese) {
        this.listaAnamnese = listaAnamnese;
    }

    public List<Solicita> getListaSolicita() {
        return listaSolicita;
    }

    public void setListaSolicita(List<Solicita> listaSolicita) {
        this.listaSolicita = listaSolicita;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    private Date dataInicio;
    
    
    
}
