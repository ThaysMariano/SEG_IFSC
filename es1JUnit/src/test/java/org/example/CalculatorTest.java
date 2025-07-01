package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //assertEquals(2, Calculator.add(1,1));
        assertAll( "add",
                () -> assertEquals(2, Calculator.add(1,1)),
//                () -> assertEquals(0, Calculator.add()),
                () -> assertEquals(4, Calculator.add(2, -3, 5))

        );

        //quero que jogue a exception  (o que espero, situacao)
        assertThrows(IllegalArgumentException.class, () -> Calculator.add(null)); //soltou nullPointExep, deu erro
        assertThrows(IllegalArgumentException.class, () -> Calculator.add());
        assertThrows(IllegalArgumentException.class, () -> Calculator.add(1));

    }

    @Test
    void multiply() {
    }
}