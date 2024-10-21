package com.aljosasolak.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Seleciton icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw dash rectangle");
    }
}
