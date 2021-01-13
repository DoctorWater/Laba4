package com.company;

public class Defender extends Male implements Guardian {
    @Override
    public void guard(String nameOfGirl, String nameOfBoy) {System.out.println("Хватит обижать " + nameOfGirl + ", -- крикнул " + nameOfBoy);}
    @Override
    public void noCurse(String nameOfBoy) {System.out.println(nameOfBoy + " не может обижать малышек!"); }
    @Override
    public void laugh(String nameOfBoy, String nameOfBully) {System.out.println(nameOfBoy+" засмеялся, тыкая пальцем в " + nameOfBully+"!");}
}