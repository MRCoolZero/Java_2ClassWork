package ru.rickSanchez.company.class_work_2;

public interface Bull extends Animal{
    default void walk(){
        System.out.println("on hooves");
    }
    void voice();
}
