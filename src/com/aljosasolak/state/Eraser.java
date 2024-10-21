package com.aljosasolak.state;

public class Eraser implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something");
    }
}
