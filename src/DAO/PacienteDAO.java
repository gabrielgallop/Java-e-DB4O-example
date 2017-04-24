package DAO;

import Classes.Paciente;
import Classes.Medico;
import Classes.Pessoa;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    private ConexaoBD con = new ConexaoBD();
    private ObjectContainer db;
    private  boolean jaexiste= false;
    public void create(Paciente paciente) {
        try {
            db = con.Conectar();
            Pessoa p  = new Pessoa();
            p.setCpf(paciente.getCpf());
            ObjectSet result = db.queryByExample(new Pessoa());
            Pessoa busca[] = new Pessoa[result.size()];
            for (int i=0; i<result.size();i++)
            {
                busca[i]= (Pessoa) result.next();
                if (p.getCpf().equals(busca[i].getCpf()))
                {
                    JOptionPane.showMessageDialog(null, "Paciente ja está cadastrado, verificar CPF!");
                    jaexiste=true;
                    break;
                }
            }
            if(jaexiste==false)
            {
                db.store(paciente);
            }
            
        } finally {
            if(jaexiste==false)
            {
                db.close();
                JOptionPane.showMessageDialog(null, "Paciente cadastrado!");
           }
           else
            {
                db.close();
                //JOptionPane.showMessageDialog(null, "Medico cadastrado!");
            }
        }
    }

    public void edit(Paciente paciente, Paciente oldPaciente) {
        try {
            db = con.Conectar();
            Paciente p;
            System.out.println("CPF = "+oldPaciente.getCpf());
            ObjectSet resultado = db.queryByExample(new Paciente(oldPaciente.getCpf()));
            System.out.println("" + resultado.size());
            if (resultado.size() > 0) {
                p = (Paciente) resultado.next();
                
                if (p.getCpf().equals(paciente.getCpf())) {
                    p.setCpf(paciente.getCpf());
                    p.setEmail1(paciente.getEmail1());
                    p.setEmail2(paciente.getEmail2());
                    p.setEndereco(paciente.getEndereco());
                    p.setFone(paciente.getFone());
                    p.setNome(paciente.getNome());
                    db.store(p);
                }
                 JOptionPane.showMessageDialog(null, "Paciente editado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado");
            }

        } finally {
            db.close();
        }
    }

    public void destroy(Paciente idFunciona) {
        try {
            db = con.Conectar();
            ObjectSet resultado = db.queryByExample(idFunciona);
            Paciente paciente = (Paciente) resultado.next();
            db.delete(paciente);
        } finally {
            db.close();
        }
    }

    public List<Paciente> getALL() {
        try {
            db = con.Conectar();
            Paciente paciente = new Paciente();
            ObjectSet resultado = db.queryByExample(paciente);
            List<Paciente> p = new ArrayList<>();
            while (resultado.hasNext()) {
                paciente = (Paciente) resultado.next();
                p.add(paciente);
            }
            return p;
        } finally {
            db.close();
        }

    }

    public List<Paciente> filtrarPorCPF(String cpf) {
        try {
            db = con.Conectar();
            Paciente paciente = new Paciente();
            Query query = db.query();
            query.constrain(Paciente.class);
            query.descend("cpf").constrain(cpf);
            ObjectSet resultado = query.execute();
            List<Paciente> p = new ArrayList<>();
            while (resultado.hasNext()) {
                paciente = (Paciente) resultado.next();
                p.add(paciente);
            }
            return p;
        } finally {
            db.close();
        }
    }

}
