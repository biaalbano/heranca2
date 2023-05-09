public class Aluno extends Pessoa {

    private String semestre;
    private String curso;

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSemestre() {
        return this.semestre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public Aluno(String nome, int idade, String endereco, String semestre, String curso) {
        super(nome, idade, endereco);
        setSemestre(semestre);
        setCurso(curso);
    }

    public Aluno() {
    }
}