package com.company;

public class Buller extends Male implements Bully{
    @Override
    public void beat(String nameOfVictim, String nameOfBoy) {
        System.out.println(nameOfBoy+" жестоко избил "+nameOfVictim + "!");
    }
    @Override
    public void ashamed(String nameOfBoy) {
        System.out.println(nameOfBoy + " извиняется и перестает обижать малышек!");
    }
}
