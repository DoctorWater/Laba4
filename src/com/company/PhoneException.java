package com.company;

public class PhoneException extends Exception{
    public PhoneException(String message){
        super(message);
    }
}

class MessageOfPhoneEx{
    public static void isAlpha(String name) throws PhoneException {
        if (name.matches("[0-9]+")==false) throw new PhoneException("Она врет, это не телефон!");
    }
}