package Classes;

public class Fone {

    private String ddd;

    private String prefixo;

    private String numero;

    private String ramal;

    private String tipo;

    public String telefone;
    
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Fone(String ddd, String prefixo, String numero, String ramal, String tipo) {
        this.ddd = ddd;
        this.prefixo = prefixo;
        this.numero = numero;
        this.ramal = ramal;
        this.tipo = tipo;
        this.telefone =  ddd + prefixo + numero + tipo;;
    }

    public Fone() {
        this.ddd = "";
        this.prefixo = "";
        this.numero = "";
        this.ramal = "";
        this.tipo = "";
        this.telefone = "";
    }  


}
