package DAO;

import Classes.Prontuario;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ProntuarioDAO {

    private ConexaoBD con = new ConexaoBD();
    private ObjectContainer db;

    public void create(Prontuario prontuario) {
        try {
            db = con.Conectar();
            db.store(prontuario);
        } finally {
            db.close();
            JOptionPane.showMessageDialog(null, "Prontuario cadastrado!");
        }
    }

    public void edit(Prontuario prontuario, Prontuario oldProntuario) {
           try {
            db = con.Conectar();
            Prontuario p;
           /* ObjectSet resultado = db.queryByExample(new Prontuario(oldProntuario.getCpf()));
            if (resultado.size() > 0) {
                p = (Prontuario) resultado.next();
                
                if (p.getCpf().equals(prontuario.getCpf())) {
                    p.setCpf(prontuario.getCpf());
                    p.setEmail1(prontuario.getEmail1());
                    p.setEmail2(prontuario.getEmail2());
                    p.setEndereco(prontuario.getEndereco());
                    p.setFone(prontuario.getFone());
                    p.setNome(prontuario.getNome());
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

    public void destroy(Prontuario idFunciona) {
        try {
            db = con.Conectar();
            ObjectSet resultado = db.queryByExample(idFunciona);
            Prontuario prontuario = (Prontuario) resultado.next();
            db.delete(prontuario);
        } finally {
            db.close();
        }
    }

    public List<Prontuario> getALL() {
        try {
            db = con.Conectar();
            Prontuario prontuario = new Prontuario();
            ObjectSet resultado = db.queryByExample(prontuario);
            List<Prontuario> p = new ArrayList<>();
            while (resultado.hasNext()) {
                prontuario = (Prontuario) resultado.next();
                p.add(prontuario);
            }
            return p;
        } finally {
            db.close();
        }

    }

    public List<Prontuario> filtrarPorCPF(String cpf) {
        try {
            db = con.Conectar();
            Query query = db.query();
            query.constrain(Prontuario.class);
            query.descend("cpf").constrain(cpf);
            ObjectSet resultado = query.execute();
            List<Prontuario> p = new ArrayList<>();
            while (resultado.hasNext()) {
                Prontuario prontuario = (Prontuario) resultado.next();
                p.add(prontuario);
            }
            return p;
        } finally {
            db.close();
        }
    }

}
