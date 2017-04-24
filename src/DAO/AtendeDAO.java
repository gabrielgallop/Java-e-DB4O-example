package DAO;

import Classes.Atende;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AtendeDAO {

    private ConexaoBD con = new ConexaoBD();
    private ObjectContainer db;

    public void create(Atende atende) {
        try {
            db = con.Conectar();
            db.store(atende);
        } finally {
            db.close();
            JOptionPane.showMessageDialog(null, "Atende cadastrado!");
        }
    }

    public void edit(Atende atende, Atende oldAtende) {
           try {
            db = con.Conectar();
            Atende p;
           /* ObjectSet resultado = db.queryByExample(new Atende(oldAtende.getCpf()));
            if (resultado.size() > 0) {
                p = (Atende) resultado.next();
                
                if (p.getCpf().equals(atende.getCpf())) {
                    p.setCpf(atende.getCpf());
                    p.setEmail1(atende.getEmail1());
                    p.setEmail2(atende.getEmail2());
                    p.setEndereco(atende.getEndereco());
                    p.setFone(atende.getFone());
                    p.setNome(atende.getNome());
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

    public void destroy(Atende idFunciona) {
        try {
            db = con.Conectar();
            ObjectSet resultado = db.queryByExample(idFunciona);
            Atende atende = (Atende) resultado.next();
            db.delete(atende);
        } finally {
            db.close();
        }
    }

    public List<Atende> getALL() {
        try {
            db = con.Conectar();
            Atende atende = new Atende();
            ObjectSet resultado = db.queryByExample(atende);
            List<Atende> p = new ArrayList<>();
            while (resultado.hasNext()) {
                atende = (Atende) resultado.next();
                p.add(atende);
            }
            return p;
        } finally {
            db.close();
        }

    }

    public List<Atende> filtrarPorCPF(String cpf) {
        try {
            db = con.Conectar();
            Query query = db.query();
            query.constrain(Atende.class);
            query.descend("cpf").constrain(cpf);
            ObjectSet resultado = query.execute();
            List<Atende> p = new ArrayList<>();
            while (resultado.hasNext()) {
                Atende atende = (Atende) resultado.next();
                p.add(atende);
            }
            return p;
        } finally {
            db.close();
        }
    }

}
