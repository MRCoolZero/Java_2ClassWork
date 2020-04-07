package ru.rickSanchez.company.class_work_2;

public interface Human extends Animal{
    default void walk(){
        System.out.println("on legs");
    }
    void think();
}
