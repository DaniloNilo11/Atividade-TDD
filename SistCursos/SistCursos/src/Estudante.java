import java.util.Date;
import java.util.Objects;


public class Estudante {
    private String nome;
    private int matricula;
    private String dataNasc;
    private String endereco;
    private String emailInstitu;

    public Estudante(String nome, int matricula, String dataNasc, String endereco, String emailInstitu) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.emailInstitu = emailInstitu;
    }

    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}
    public int getMatricula() {
        return matricula;}
    public void setMatricula(int matricula) {
        this.matricula = matricula;}
    public String getDataNasc() {
        return dataNasc;}
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;}
    public String getEndereco() {
        return endereco;}
    public void setEndereco(String endereco) {
        this.endereco = endereco;}
    public String getEmailInstitu() {
        return emailInstitu;}
    public void setEmailInstitu(String emailInstitu) {
        this.emailInstitu = emailInstitu;}

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataNasc=" + dataNasc +
                ", endereco='" + endereco + '\'' +
                ", emailInstitu='" + emailInstitu + '\'' +
                '}';
    }
}
