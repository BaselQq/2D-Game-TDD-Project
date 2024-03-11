package org.example;

public class PlayerCharacter {

    static int X = 0;
    static int Y = 0;

    public static int getX() {
        return X;
    }

    public static int getY() {
        return Y;
    }

    public static boolean move(String input) {
        if (input.equals("W")) {
            Y = Y+1;
       }

        if (Y==1) {
            return true;
        }

        return false;
    }
}
