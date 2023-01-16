
import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;
    private String dataNasc;
    private String enderecoCompleto;
    
    public Usuario(String nome, String email, String dataNasc, String enderecoCompleto) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setData_nasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

	
	
    
}
