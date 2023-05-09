public class Pessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Isaque", 24, "Etec");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereço());

        Funcionario funcionario = new Funcionario(2000000, "Isaque", 24, "Etec");

        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Endereço: " + funcionario.getEndereço() + "\n");

        Aluno aluno = new Aluno("João", 17, "Ibirarema", "3º", "Informática");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Endereço: " + aluno.getEndereço());
        System.out.println("Semestre: " + aluno.getSemestre());
        System.out.println("Curso: " + aluno.getCurso() + "\n");

        Professor professor = new Professor(2000000, "Isaque", 24, "Etec", "PW2");

        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Endereço: " + professor.getEndereço());
        System.out.println("Disciplina: " + professor.getDisciplina() + "\n");

        FuncAdm funcadm = new FuncAdm("PW2", "Professor", 2000000, "Isaque", 24, "Etec");

        System.out.println("Salário: " + funcadm.getSalario());
        System.out.println("Nome: " + funcadm.getNome());
        System.out.println("Idade: " + funcadm.getIdade());
        System.out.println("Endereçõ: " + funcadm.getEndereço());
        System.out.println("Setor: " + funcadm.getSetor());
        System.out.println("Função: " + funcadm.getFuncao());

    }

    private String nome;
    private int idade;
    private String endereço;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public Pessoa(String nome, int idade, String endereço) {
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }

    public Pessoa() {

    }
}