package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerCharacterTest {

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
    void move_returnYEquals1_whenWClicked() {
        //GIVEN
        String input = "W";
        //WHEN
        boolean actual = PlayerCharacter.move(input);
        //THEN
        Assertions.assertTrue(actual);
    }
}
