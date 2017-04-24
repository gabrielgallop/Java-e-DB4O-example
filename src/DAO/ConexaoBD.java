package DAO;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import javax.swing.JOptionPane;

public class ConexaoBD {

 
    public ConexaoBD() {
    }

    public ObjectContainer Conectar() {
        try {
            ObjectContainer db = Db4o.openFile("/home/gabriel/Documentos/prontuario.yap");
            return db;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no Banco");
            return null;
        }

    }

}
