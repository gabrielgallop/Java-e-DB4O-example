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
public class Anamnese {

    private String pergunta;
    private String resposta;

    public Anamnese(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

   

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
