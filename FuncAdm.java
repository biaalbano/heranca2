public class FuncAdm extends Funcionario {

    private String setor;
    private String funcao;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public FuncAdm(String setor, String funcao, double salario, String nome, int idade, String endereco) {
        super(salario, nome, idade, endereco);
        setSetor(setor);
        setFuncao(funcao);
    }

    public FuncAdm() {

    }

    public FuncAdm(int i, String string, int j, String string2) {
    }

    public FuncAdm(int i, String string, int j, String string2, String string3) {
    }
}