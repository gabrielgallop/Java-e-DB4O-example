package DAO;

import Classes.Medico;
import Classes.Pessoa;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    private ConexaoBD con = new ConexaoBD();
    private ObjectContainer db;
    private  boolean jaexiste= false;

    public void create(Medico medico) {
        try {
            db = con.Conectar();
            Pessoa p  = new Pessoa();
            p.setCpf(medico.getCpf());
            ObjectSet result = db.queryByExample(new Pessoa());
            Pessoa busca[] = new Pessoa[result.size()];
            for (int i=0; i<result.size();i++)
            {
                busca[i]= (Pessoa) result.next();
                if (p.getCpf().equals(busca[i].getCpf()))
                {
                    JOptionPane.showMessageDialog(null, "Medico ja está cadastrado, verificar CPF!");
                    jaexiste=true;
                    break;
                }
            }
            if(jaexiste==false)
            {
                db.store(medico);
            }
        } finally {
            if(jaexiste==false)
            {
                db.close();
                JOptionPane.showMessageDialog(null, "Medico cadastrado!");
           }
           else
            {
                db.close();
                //JOptionPane.showMessageDialog(null, "Medico cadastrado!");
            }
        }
    }

    public void edit(Medico medico, Medico oldMedico) {
           try {
            db = con.Conectar();
            Medico p;
            ObjectSet resultado = db.queryByExample(new Medico(oldMedico.getCpf()));
            if (resultado.size() > 0) {
                p = (Medico) resultado.next();
                
                if (p.getCpf().equals(medico.getCpf())) {
                    p.setCpf(medico.getCpf());
                    p.setEmail1(medico.getEmail1());
                    p.setEmail2(medico.getEmail2());
                    p.setEndereco(medico.getEndereco());
                    p.setFone(medico.getFone());
                    p.setNome(medico.getNome());
                    db.store(p);
                }
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }

        } finally {
            db.close();
        }
    }

    public void destroy(Medico idFunciona) {
        try {
            db = con.Conectar();
            ObjectSet resultado = db.queryByExample(idFunciona);
            Medico medico = (Medico) resultado.next();
            db.delete(medico);
        } finally {
            db.close();
        }
    }

    public List<Medico> getALL() {
        try {
            db = con.Conectar();
            Medico medico = new Medico();
            ObjectSet resultado = db.queryByExample(medico);
            List<Medico> p = new ArrayList<>();
            while (resultado.hasNext()) {
                medico = (Medico) resultado.next();
                p.add(medico);
            }
            return p;
        } finally {
            db.close();
        }

    }

    public List<Medico> filtrarPorCPF(String cpf) {
        try {
            db = con.Conectar();
            Query query = db.query();
            query.constrain(Medico.class);
            query.descend("cpf").constrain(cpf);
            
            ObjectSet resultado = query.execute();
            List<Medico> p = new ArrayList<>();
            while (resultado.hasNext()) {
                Medico medico = (Medico) resultado.next();
                p.add(medico);
            }
            return p;
        } finally {
            db.close();
        }
    }

}
