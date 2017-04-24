package Classes;

public class Nome {

    private String prenome;

    private String sobrenome;

    private String nome;

    public Nome(String prenome, String sobrenome) {
        this.prenome = prenome;
        this.sobrenome = sobrenome;
        this.nome = prenome + " " + sobrenome;
    }

    public String getPrenome() {
        return prenome;
    }

    public void setPrenome(String prenome) {
        this.prenome = prenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return prenome + " " + sobrenome;
    }

    public Nome() {
        this.prenome = "";
        this.sobrenome = "";
        this.nome = "";
    }

}
