package com.company;

public class NullEnterException extends RuntimeException{
    public NullEnterException(String message){
        super(message);
    }
}

class MessageOfRuntime{
    public static void getMessage(String Enter) throws NullEnterException{
        if(Enter=="") throw new NullEnterException("У предмета нет названия! Атас!");
    }
}