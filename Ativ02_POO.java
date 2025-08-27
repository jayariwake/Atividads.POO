//1. Classe Pessoa (Construtor e Atributos Públicos)
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Main
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("João", 30);

        System.out.println("Pessoa 1: " + p1.getNome() + ", " + p1.getIdade() + " anos");
        System.out.println("Pessoa 2: " + p2.getNome() + ", " + p2.getIdade() + " anos");
    }
}

//2. Classe Carro (Atributos Privados e Getters)
public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    // Main
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bugatti Veyron", 2013);

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano: " + carro1.getAno());
    }
}

//3. Classe ContaBancaria (Encapsulamento + Métodos Públicos)
public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Main
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(12345, 500.0);

        conta.depositar(200.0);
        conta.sacar(100.0);
        conta.sacar(700.0);

        System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
    }
}

//4. Classe Produto (Setters com Validação)
public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! O preço não pode ser negativo.");
        }
    }

    // main
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00);
        System.out.println(p1.getNome() + " - R$" + p1.getPreco());

        Produto p2 = new Produto("Televisão", -1200.00);
        System.out.println(p2.getNome() + " - R$" + p2.getPreco());

        p1.setPreco(2800.00);
        System.out.println("Novo preço do " + p1.getNome() + ": R$" + p1.getPreco());

        p1.setPreco(-500.00);
        System.out.println("Preço após tentativa inválida: R$" + p1.getPreco());
    }
}
