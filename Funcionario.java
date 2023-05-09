
    public class Funcionario extends Pessoa {

        private double salario;
    
        public void setSalario(double salario) {
            this.salario = salario;
        }
    
        public double getSalario() {
            return this.salario;
        }
    
        public Funcionario(double salario, String nome, int idade, String endereco) {
            super(nome, idade, endereco);
            setSalario(salario);
        }
    
        public Funcionario() {
    
        }
    
}
