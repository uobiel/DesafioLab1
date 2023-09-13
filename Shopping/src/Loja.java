public class Loja {
    private String nome;
    private int quantidadeFuncionários;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionários, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionários = quantidadeFuncionários;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionários) {
        this.nome = nome;
        this.quantidadeFuncionários = quantidadeFuncionários;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionários() {
        return quantidadeFuncionários;
    }

    public void setQuantidadeFuncionários(int quantidadeFuncionários) {
        this.quantidadeFuncionários = quantidadeFuncionários;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public String toString() {
        return "Nome da loja: " + this.nome + " | Quantidade de funcionários: " + this.quantidadeFuncionários
                + " | Salário base dos funcionários: " + salarioBaseFuncionario;
    }

    public double gastosComSalario() {

        if (salarioBaseFuncionario == -1) {
            return -1;
        }

        double gastoSalarios = salarioBaseFuncionario * quantidadeFuncionários;

        return gastoSalarios;

    }

    public char tamanhoDaLoja() {

        if (this.quantidadeFuncionários < 10) {
            return 'P';
        }

        else if (this.quantidadeFuncionários >= 10 && this.quantidadeFuncionários <= 30) {
            return 'M';
        }

        else if (this.quantidadeFuncionários >= 31) {
            return 'G';
        }

        return '0';
    }

}
