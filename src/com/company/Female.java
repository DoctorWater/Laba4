package com.company;

import java.util.Objects;

public class Female extends Speak implements Action{
    private String name;
    private int DNA;
    private Sex gender=Sex.Female;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public Sex getGender()
    {
        return gender;
    }
    @Override
    public void curse(String name) {System.out.println("Ты дурак, " + name + "!");}
    @Override
    public void phrase(String phrase) {System.out.println(phrase);}
    public void setDNA(int DNA) { this.DNA=DNA;}
    public double getDNA() { return DNA;}
    public void respect(String nameOfBoy) {
        System.out.println(nameOfBoy+", спасибо тебе!");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, DNA, gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Female female = (Female) o;
        return DNA == female.DNA &&
                Objects.equals(name, female.name) &&
                gender == female.gender;
    }
    @Override
    public void tell(String story) {
        System.out.println(story);
    }
    @Override
    public void think(String thought) {
        System.out.println(thought);
    }
    @Override
    public void work() {
        System.out.println(this.name + " работает в поте лица!");
    }

    @Override
    public void useItem(String nameOfItem) {
        System.out.println(this.name + " использует " + nameOfItem);
    }

    @Override
    public void jump() {
        System.out.println(this.name + " подпрыгивает!");
    }
}
