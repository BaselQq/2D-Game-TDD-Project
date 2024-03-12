package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerCharacterTest {

    @BeforeEach
    void resetXY() {
        PlayerCharacter.X = 0;
        PlayerCharacter.Y = 0;
    }

    @Test
    void getX_returnNull_whenTheGameStarted() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getY_returnNull_whenTheGameStarted() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_returnTrueY_whenWClicked() {
        //GIVEN
        String input = "W";
        //WHEN
        boolean actual = PlayerCharacter.move(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void move_returnTrue_whenSClicked() {
        //GIVEN
        String input = "S";
        //WHEN
        boolean actual = PlayerCharacter.move(input);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void move_returnTrue_whenDClicked() {
        //GIVEN
        String input = "D";
        //WHEN
        boolean actual = PlayerCharacter.move(input);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    void move_returnTrue_whenAClicked() {
        //GIVEN
        String input = "A";
        //WHEN
        boolean actual = PlayerCharacter.move(input);
        //THEN
        Assertions.assertTrue(actual);
    }
}
