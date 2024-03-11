package org.example;

public class PlayerCharacter {

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static boolean move(String input) {
        int Y = 0;
        if (input.equals("W")) {
            Y = Y+1;
       }

        if (Y==1 ) {
            return true;
        } return false;
    }
}
