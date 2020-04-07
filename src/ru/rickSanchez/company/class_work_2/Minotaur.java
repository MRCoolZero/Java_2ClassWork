package ru.rickSanchez.company.class_work_2;

public class Minotaur implements Human, Bull {

    @Override
    public void walk() {
        Bull.super.walk();
    }

    @Override
    public void voice() {
        System.out.println("aaaaaarrrrghhhh");
    }

    @Override
    public void think() {
        System.out.println("invent new riddles");
    }

    @Override
    public void breather() {

    }

    @Override
    public void look() {

    }
}
