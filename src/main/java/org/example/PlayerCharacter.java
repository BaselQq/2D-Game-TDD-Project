package org.example;

public class PlayerCharacter {

    public static int X = 0;
    public static int Y = 0;

    public static int getX() {
        return X;
    }

    public static int getY() {
        return Y;
    }

    public static boolean move(String input) {
        if (input.equals("W")) {
            Y = Y + 1;
        }

        if (Y == 1) {
            return true;
        }

        if (input.equals("S")) {
            Y = Y -1;
        }

        if (Y == -1) {
            return true;
        }

        if (input.equals("D")) {
            X = X + 1;
        }

        if (X == 1) {
            return true;
        }

        if (input.equals("A")) {
            X = X -1;
        }

        if (X == -1) {
            return true;
        }

        return false;
    }


}
