package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p = new Pessoa("Thays Mariano", "10742862941");
    Pessoa ps = new Pessoa("Ana Clara", "34743562941");

    @Test
    void getCpf() {

        //testa se pega corretamente
        assertAll("getCpf",
                () -> assertEquals("10742862941", p.getCpf()),
                () -> assertEquals("34743562941", ps.getCpf())
        );

    }

    @Test
    void setCpf() {

        //testa se cai no erro

        //cpf invalido
        assertThrows(IllegalArgumentException.class, () -> p.setCpf("10712342941"));
        //cpf vazio
        assertThrows(IllegalArgumentException.class, () -> p.setCpf(" "));
        //cpf nulo
        assertThrows(IllegalArgumentException.class, () -> p.setCpf(""));


    }

    @Test
    void getNome() {

        assertAll("getNome",

                () -> assertEquals("Thays Mariano", p.getNome()),
                () -> assertEquals("Ana Clara", ps.getNome())
        );

    }

    @Test
    void setNome() {

        assertThrows(IllegalArgumentException.class, () -> p.setNome(" "));
        assertThrows(IllegalArgumentException.class, () -> p.setNome(""));
        assertThrows(IllegalArgumentException.class, () -> p.setNome("Ana"));


    }

    @Test
    void isValidCPF() {

        assertTrue(p.isValidCPF(p.getCpf()));
        assertFalse(ps.isValidCPF(ps.getCpf()));

    }

}