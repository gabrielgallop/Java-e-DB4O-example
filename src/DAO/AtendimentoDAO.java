package DAO;

import Classes.Atendimento;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoDAO {

    private ConexaoBD con = new ConexaoBD();
    private ObjectContainer db;

    public void create(Atendimento atendimento) {
        try {
            db = con.Conectar();
            db.store(atendimento);
        } finally {
            db.close();
            JOptionPane.showMessageDialog(null, "Atendimento cadastrado!");
        }
    }

    public void edit(Atendimento atendimento, Atendimento oldAtendimento) {
           try {
            db = con.Conectar();
            Atendimento p;
           /* ObjectSet resultado = db.queryByExample(new Atendimento(oldAtendimento.getCpf()));
            if (resultado.size() > 0) {
                p = (Atendimento) resultado.next();
                
                if (p.getCpf().equals(atendimento.getCpf())) {
                    p.setCpf(atendimento.getCpf());
                    p.setEmail1(atendimento.getEmail1());
                    p.setEmail2(atendimento.getEmail2());
                    p.setEndereco(atendimento.getEndereco());
                    p.setFone(atendimento.getFone());
                    p.setNome(atendimento.getNome());
                    db.store(p);
                }
                JOptionPane.showMessageDialog(null, "Cadastro editado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }*/

        } finally {
            db.close();
        }
    }

    public void destroy(Atendimento idFunciona) {
        try {
            db = con.Conectar();
            ObjectSet resultado = db.queryByExample(idFunciona);
            Atendimento atendimento = (Atendimento) resultado.next();
            db.delete(atendimento);
        } finally {
            db.close();
        }
    }

    public List<Atendimento> getALL() {
        try {
            db = con.Conectar();
            Atendimento atendimento = new Atendimento();
            ObjectSet resultado = db.queryByExample(atendimento);
            List<Atendimento> p = new ArrayList<>();
            while (resultado.hasNext()) {
                atendimento = (Atendimento) resultado.next();
                p.add(atendimento);
            }
            return p;
        } finally {
            db.close();
        }

    }

    public List<Atendimento> filtrarPorCPF(String cpf) {
        try {
            db = con.Conectar();
            Query query = db.query();
            query.constrain(Atendimento.class);
            query.descend("cpf").constrain(cpf);
            ObjectSet resultado = query.execute();
            List<Atendimento> p = new ArrayList<>();
            while (resultado.hasNext()) {
                Atendimento atendimento = (Atendimento) resultado.next();
                p.add(atendimento);
            }
            return p;
        } finally {
            db.close();
        }
    }

}
