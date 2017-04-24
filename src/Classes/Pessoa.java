package Classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pessoa {

    private Nome nome;

    private String cpf;

    private String email1;

    private String email2;

    private List fone = new ArrayList();

    private Endereco endereco;

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public List<Fone> getFone() {
        return fone;
    }

    public void setFone(Fone fone) {
        this.fone.add(fone);
    }
    
    public void setFone(List<Fone> fone){
        this.fone.clear();
        this.fone=fone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }  

}
