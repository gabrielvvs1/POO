package br.com.bancosantande.conta;

public class Conta {

    //atributos - caracteristicas

    private String nome;
    private int numero;
    private double saldo;

    //construtor, ele inicializa os atributos da classe
    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    // metodos-açoes
    public double saldo() { //metodo1
        return saldo;
    }

    public double sacar(double valorSaque) { //metodo2

        if (saldo < valorSaque) {
            System.out.println("Nao tem saldo suficiente, deseja fazer um emprestimo?");
            return saldo;
        }
        return saldo -= valorSaque;

    }

    public double depositar(double valor) { //metodo3
        return saldo += valor;
    }
}
