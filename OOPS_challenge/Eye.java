package com.OOPS_challenge;

public class Eye extends Organ{
    private String color;
    private boolean isOpened;

    public Eye(String name,String medicalCondition,String color,boolean isOpened){
        super(name,medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
        System.out.println("Eye is opened: "+ this.isOpened);
    }

    public void open(){
        this.setOpened(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close(){
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    public void setColor(){
        this.color = color;
    }
    public void setOpened(boolean opened){
        isOpened = opened;
    }
    public String getColor(){
        return color;
    }
    public boolean isOpened(){
        return isOpened;
    }
}
