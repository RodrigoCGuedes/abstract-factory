package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveExibirExtratoContaVarejo() {
        FabricaAbstrata fabrica = new FabricaVarejo();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Extrato da Conta Varejo", cliente.exibirExtrato());
    }

    @Test
    void deveExibirLimiteCartaoVarejo() {
        FabricaAbstrata fabrica = new FabricaVarejo();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Limite do Cartão Varejo", cliente.exibirLimite());
    }

    @Test
    void deveExibirExtratoContaPremium() {
        FabricaAbstrata fabrica = new FabricaPremium();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Extrato da Conta Premium", cliente.exibirExtrato());
    }

    @Test
    void deveExibirLimiteCartaoPremium() {
        FabricaAbstrata fabrica = new FabricaPremium();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Limite do Cartão Premium", cliente.exibirLimite());
    }
}