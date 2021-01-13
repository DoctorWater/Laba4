package com.company;

class NullEnter extends Exception {
    public NullEnter(String message){
        super(message);
    }
}

class Message{
    public static void getMessage(String Enter) throws NullEnter{
        if(Enter=="") throw new NullEnter("У предмета нет названия! Атас!");
    }
}
