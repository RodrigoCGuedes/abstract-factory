package com.example.demo;

public class FabricaPremium implements FabricaAbstrata {

    @Override
    public Conta createConta() {
        return new ContaPremium();
    }

    @Override
    public Cartao createCartao() {
        return new CartaoPremium();
    }
}