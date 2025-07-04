package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p = new Pessoa("Thays Mariano", "47333499049");
    Pessoa ps = new Pessoa("Ana Clara", "84773785098");


    @Test
    void getCpf() {

        //testa se pega corretamente
        assertAll("getCpf",
                () -> assertEquals("47333499049", p.getCpf()),
                () -> assertEquals("84773785098", ps.getCpf())
        );

    }

    @Test
    void setCpf() {

        //testa se cai no erro

        //cpf invalido
        assertThrows(IllegalArgumentException.class, ()-> p.setCpf("47333491049"));
        //cpf vazio
        assertThrows(IllegalArgumentException.class, ()-> p.setCpf(" "));
        //cpf nulo
        assertThrows(IllegalArgumentException.class, ()-> p.setCpf(""));


    }

    @Test
    void getNome() {

        assertAll("getNome",

                ()-> assertEquals("Thays Mariano", p.getNome()),
                () -> assertEquals("Ana Clara", ps.getNome())
                );

    }

    @Test
    void setNome() {

        assertDoesNotThrow(()-> ps.setCpf("47333499049"));

        assertThrows(IllegalArgumentException.class, ()-> p.setNome(" "));
        assertThrows(IllegalArgumentException.class, ()-> p.setNome(""));
        assertThrows(IllegalArgumentException.class, ()-> p.setNome("Ana"));


    }

    @Test
    void isValidCPF(){

        assertTrue(p.isValidCPF(p.getCpf()));
        //assertFalse(ps.isValidCPF(ps.getCpf()));  <- funcionou mas alterei

    }

    }