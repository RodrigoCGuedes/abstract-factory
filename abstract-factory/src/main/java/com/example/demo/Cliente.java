package com.example.demo;

public class Cliente {

    private Conta conta;
    private Cartao cartao;

    public Cliente (FabricaAbstrata fabrica) {
        this.conta = fabrica.createConta();
        this.cartao = fabrica.createCartao();
    }

    public String exibirExtrato() {
        return this.conta.exibir();
    }

    public String exibirLimite() {
        return this.cartao.exibir();
    }
}