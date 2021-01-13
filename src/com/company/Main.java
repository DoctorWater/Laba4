package com.company;

public class Main {
    public static void main(String[] args) {
        Male Ponchik = new Male();
        Ponchik.setName("Пончик");
        Ponchik.tell("Ах, какие вкусные пирожки были у малышек!");
        Male Siropchik = new Male();
        Siropchik.setName("Сиропчик");
        Siropchik.phrase("И газированной воды было так много..!");
        Male Znayka = new Male();
        Znayka.setName("Знайка");
        Znayka.tell("И водопровод можно сделать такой же, и фонтаны, и мост...");
        Item Seed = new Item();
        Seed.setName("");
        Siropchik.useItem(Seed.getName());
        Siropchik.phrase("Смотрите, какое огромное!");
        Male Avoska = new Male();
        Avoska.setName("Авоська");
        Male Toropijka = new Male();
        Toropijka.setName("Торопыжка");
        Avoska.tell("Мы с Торопыжкой с ними урожай убирали! А, Торопыжка?");
        Toropijka.phrase("А то! Помогли, чем смогли!");
        Male Vintik = new Male();
        Male Shpuntik = new Male();
        Vintik.setName("Винтик");
        Shpuntik.setName("Шпунтик");
        Vintik.tell("У них там все на механике! Машины везде, а на одной из них ездит Бублик! Уж он-то умеет с ней управляться!");
        Shpuntik.tell("А Шурупчик! Вот бы его костюмчик сделать!");
        Male Pulka = new Male();
        Pulka.setName("Пулька");
        Pulka.think("А больница их -- не чета нашей... Мне так ногу залатали! Смотрите!");
        Pulka.jump();
        Male Molchun = new Male();
        Molchun.setName("Молчун");
        Molchun.phrase("Отличные они малышки! Вот бы еще раз к ним съездить...");


        Defender Neznaika = new Defender();
        Neznaika.setName("Незнайка");
        Neznaika.setDNA((int) (Math.random() * 1000000));
        Female Knoposhka = new Female();
        Knoposhka.setName("Кнопочка");
        Neznaika.phrase("Будем дружить, " + Knoposhka.getName() + "?");
        Knoposhka.phrase("Будем, " + Neznaika.getName() + "!");
        Female Victim = new Female();
        Victim.setName("Белочка");
        Victim.setDNA((int) (Math.random() * 1000000));
        Buller Bully = new Buller();
        Bully.setName("Шпунтик");
        Bully.setDNA((int) (Math.random() * 1000000));
        Bully.curse(Victim.getName());
        Neznaika.laugh(Neznaika.getName(), Bully.getName());
        Victim.respect(Neznaika.getName());
        Bully.ashamed(Bully.getName());
        Defender def1 = new Defender();
        def1.setName("Шпунтик");
        def1.setDNA((int) (Math.random() * 1000000));
        def1.noCurse(def1.getName());
        Buller bull = new Buller();
        bull.setName("Цветочек");
        bull.setDNA((int) (Math.random() * 1000000));
        bull.curse(Victim.getName());
        bull.beat(Victim.getName(), bull.getName());
        def1.laugh(def1.getName(), bull.getName());
        bull.ashamed(bull.getName());


        System.out.println("А потом малыши и малышки вместе построили новые домики. Они усердно трудились, так давайте посмотрим, что у них получилось!");
        Ponchik.getHouse();

        Dancing DancingInPairs = new Dancing() {
            @Override
            public void StartDancing() {
                System.out.println(Ponchik.getName() + " танцует с малышкой!");
            }
        };
        DancingInPairs.StartDancing();
        Ponchik.AskHerPhone("89999999999");


        if (bull.equals(def1)) {
            System.out.println("Да, это точно он!");
        }
        else
        {
            if (bull.hashCode() == def1.hashCode()) {
                System.out.println("Опять ты за старое, " + bull.getName() + "!");
            }
        }
        System.out.println(bull.toString());
    }
}
