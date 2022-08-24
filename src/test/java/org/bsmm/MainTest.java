package org.bsmm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void isBalanced() {
        String input;
        Main.cleanStack();
        input = "(2+[3-12]*{8/3})";
        assertEquals(true, Main.isBalanced(input));

        Main.cleanStack();
        input = "[()]{}{[()()]()}";
        assertEquals(true, Main.isBalanced(input));

        Main.cleanStack();
        input = "(2+[3-12]*{8/3}";
        assertEquals(false, Main.isBalanced(input));
    }
}