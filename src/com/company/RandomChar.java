package com.company;

public class RandomChar {
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
    private static int sLength = sAlphabet.length;

    public static char getRandomChar() {
        return sAlphabet[(int)(Math.random() * sLength)];
    }
}
