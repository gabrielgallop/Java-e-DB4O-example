/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fagner
 */
public class Paciente extends Pessoa {
    
    
    private List atende = new ArrayList();

    public Paciente() {
    }

    public Paciente(String cpf) {
        this.setCpf(cpf);
    }
    
    @Override
    public String toString(){
        return getNome().getNome();
    }
    
}
