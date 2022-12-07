import java.util.Collection;


public class Curso {
    String nome;
    String cargaHoraria;
    String descricao;
    String matriculas;

    private Estudante curso[]=new Estudante[30];
    private int tam=0;

    public Curso(String nome, String cargaHoraria, String matriculas) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.matriculas = matriculas;
    }

    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}
    public String getCargaHoraria() {
        return cargaHoraria;}
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;}
    public String getDescricao() {
        return descricao;}
    public void setDescricao(String descricao) {
        this.descricao = descricao;}

    public String getMatriculas() {
        return matriculas;}
    public void setMatriculas(String matriculas) {
        this.matriculas = matriculas;}

    public void matriculas(Estudante aluno) {
    }

    public void cadastrarAluno(String nome, int matricula, String dataNasc, String endereco, String emailInstitu){
        curso[tam]= new Estudante(nome,matricula, dataNasc, endereco, emailInstitu);
        tam++;
    }


}

