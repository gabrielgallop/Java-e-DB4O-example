/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Manager.AtendeManager;
import Manager.MedicoManager;
import Manager.PacienteManager;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.List;

/**
 *
 * @author Fagner
 */
public class Main {

    static PacienteManager pessoaManager = new PacienteManager();
    static AtendeManager atende = new AtendeManager();
    public static void main(String[] args) {
        ObjectContainer db = Db4o.openFile("E:/prontuario.yap");
             try {
                 Listar(db);
                 } finally {
            db.close();
        }
    }
    public static void Listar(ObjectContainer db) {
        ObjectSet result = db.queryByExample(new Atendimento());//recupera os dados 
        System.out.println("Dados");
        System.out.println("result.size(): " + result.size());
        //for (int i = 0; i < result.size(); i++) {
        //    System.out.println((Atende) result.next());
        //}
    }   
    public static void ExibirAtende(List<Atende> p) {

        for (Atende arg : p) {
            System.out.println("esta recorriendo");
                    //"CPF: " + arg.getCpf() + "\nNome: " + arg.getNome().getNome() +"  "+arg.getFone().get(0).getNumero()+ "\n");
        }

    }
    
}
             
       /* Paciente p = new Paciente();
        Paciente p2 = new Paciente();
        p.setEmail1("fagner_roger32@hotmail.com");
        p.setCpf("123456789");
        p.setEmail2("fagner.couto@dc.ufscar.br");

        p2.setCpf("04531188101");
        p2.setEmail1("");
        //------------------------------------------------      
        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setCep("13560010");
        end.setCidade("São Carlos");
        end.setRua("Av. São Carlos");
        end.setNumero("2160");
        p.setEndereco(end);

        //------------------------------------------------       
        Fone fone = new Fone();
        fone.setDdd("16");
        fone.setNumero("996287900");
        fone.setPrefixo("+55");
        fone.setRamal("22");
        fone.setTelefone("33262299");
        fone.setTipo("Celular");
        p.setFone(fone);

        //------------------------------------------------
        Nome nome = new Nome();
        nome.setPrenome("Fagner Roger Lindo");
        nome.setSobrenome("Couto");
        p.setNome(nome);

        Nome nome2 = new Nome();
        nome2.setPrenome("Viviane ");
        nome2.setSobrenome("");

        p2.setEndereco(end);
        p2.setNome(nome2);
        p2.setFone(fone);

        //   pessoaManager.destroy(med);
       //pessoaManager.create(p);
        // pessoaManager.create(p2);
//        
        List<Paciente> list = pessoaManager.filtrarPorCPF("123456789");
        Paciente newP = list.get(0);
        newP.getNome().setSobrenome("mae linda da miunha vida");
        newP.getFone().get(0).setNumero("135546");
       pessoaManager.edit(newP, list.get(0));
        */
        //ExibirPessoa(pessoaManager.filtrarPorCPF("123456789"));
         
    

    /*public static void ExibirPessoa(List<Paciente> p) {

        for (Paciente arg : p) {
            System.out.println("CPF: " + arg.getCpf() + "\nNome: " + arg.getNome().getNome() +"  "+arg.getFone().get(0).getNumero()+ "\n");
        }

    }*/
   /* public static void ExibirAtende(List<Atende> p) {

        for (Atende arg : p) {
            System.out.println("CPF: " + arg.getClass() + "\n");
                  //  + "\nNome: " + arg.getNome().getNome() +"  "+arg.getFone().get(0).getNumero()+ "\n");
        }

    }*/
   
   


