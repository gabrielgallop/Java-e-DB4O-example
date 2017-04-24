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
public class Exame {

    private int idExame;
    private String nome;
    private String descricao;
    private String indexReferencia;

    public Exame(int idExame, String nome, String descricao, String indexReferencia) {
        this.idExame = idExame;
        this.nome = nome;
        this.descricao = descricao;
        this.indexReferencia = indexReferencia;
    }

    public Exame() {
       
    }

    
    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIndexReferencia() {
        return indexReferencia;
    }

    public void setIndexReferencia(String indexReferencia) {
        this.indexReferencia = indexReferencia;
    }
    
    
    
    

}
