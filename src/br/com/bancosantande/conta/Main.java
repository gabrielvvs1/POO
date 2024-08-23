package br.com.bancosantande.conta;

public class Main {
    public static void main(String[] args) {

        Conta objConta = new Conta ("Gabriel", 54321, 10);
        System.out.println(objConta.saldo());
        System.out.println(objConta.sacar(150));
        System.out.println(objConta.depositar(100));
    }
}