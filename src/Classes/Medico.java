/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Fagner
 */
public class Medico extends Pessoa {

    public Medico() {
    }

    public Medico(String cpf) {
        this.setCpf(cpf);
    }
    
     @Override
    public String toString(){
        return getNome().getNome();
    }

}
