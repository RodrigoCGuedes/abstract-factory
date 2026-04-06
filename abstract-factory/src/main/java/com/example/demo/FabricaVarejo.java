package com.example.demo;

public class FabricaVarejo implements FabricaAbstrata {

    @Override
    public Conta createConta() {
        return new ContaVarejo();
    }

    @Override
    public Cartao createCartao() {
        return new CartaoVarejo();
    }
}