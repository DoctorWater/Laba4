package com.company;

public class Item {
    private String name;
    public void setName(String name) {
        try{
            this.name=name;
            MessageOfRuntime.getMessage(name);
        }
        catch (NullEnterException ex){
            System.out.println(ex.getMessage());
            this.name="ERROR";
        }
    }
    public String getName() {
        return name;
    }
}
