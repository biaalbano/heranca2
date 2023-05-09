public class Professor extends Funcionario {

    private String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public Professor(double salario, String nome, int idade, String endereco, String disciplina) {
        super(salario, nome, idade, endereco);
        setDisciplina(disciplina);
    }
}