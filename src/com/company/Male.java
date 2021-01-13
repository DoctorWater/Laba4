package com.company;


public class Male extends Speak implements Action{
    private String name;
    private static Sex gender=Sex.Male;
    private int DNA;
    private String NameOfHouseMain;
    private int ComfortMain, FloorMain;
    House house;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDNA(int DNA) { this.DNA=DNA;}
    public double getDNA() { return DNA;}
    public Sex getGender() {
        return gender;
    }
    @Override
    public void curse(String name) {System.out.println("Ты дура, " + name + "!");}
    @Override
    public void phrase(String phrase) {
            System.out.println(this.name + ": " +phrase);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        Male man = (Male) o;
        return DNA == man.DNA;
    }

    @Override
    public void think(String thought) {
        System.out.println(this.name + ": " +thought);
    }

    @Override
    public void tell(String story) {
        System.out.println(this.name + ": " +story);
    }

    @Override
    public void work() {
        System.out.println(this.name  + " работает в поте лица!");
    }

    @Override
    public void useItem(String nameOfItem) {
        System.out.println(this.name + " использует " + nameOfItem);
    }

    @Override
    public void jump() {
        System.out.println(this.name + " подпрыгивает!");
    }
    Male()
    {
        house=new House();
        Male.this.house.Naming();

    }


    class House{
        String ArrayOfNames1[]={"Грибной", "Огуречный","Помидорный", "Цветочный"};
        String ArrayOfNames2[]={"домик", "уголок","пентхаус"};
        String NameOfHouse;
        int Comfort, Floor;
        House(){
            Floor = (int)(Math.random() * 2 + 2);
            NameOfHouse=ArrayOfNames1[(int)(Math.random()*3)]+" "+ ArrayOfNames2[(int)(Math.random()*2)];
            Comfort=(int)(Math.random()*3+1);
        }
        public void Naming() {
            NameOfHouseMain = NameOfHouse;
            FloorMain = Floor;
            ComfortMain = Comfort;
        }
    }
    public void getHouse(){
        System.out.println("Посмотрите, какой домик построил " + this.getName() +"! " + "Он называется " + NameOfHouseMain + ", в нем " + FloorMain + " этажей, и он имеет " + ComfortMain +" уровень комфорта!");
    }


    //На этом мой энтузиазм иссяк. Вот вам скучные локальный, статик и анонимный классы.
    public void AskHerPhone(String number)
    {
        class PhoneNumber{
            private String phoneNumber;
            public PhoneNumber(){
                try {
                     this.phoneNumber=number;
                     MessageOfPhoneEx.isAlpha(number);

                }
                catch(PhoneException ex)
                {
                    System.out.println(ex.getMessage());
                    this.phoneNumber="ERROR";
                }
            }
            public String getPhoneNumber() {
                return phoneNumber;
            }
        }
        PhoneNumber HerPhone = new PhoneNumber();
        System.out.println(Male.this.getName()+" получает номер малышки, и это: " + HerPhone.phoneNumber);
    }

}






