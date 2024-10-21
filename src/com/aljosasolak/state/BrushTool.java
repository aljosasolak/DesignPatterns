package com.aljosasolak.state;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("BrushTool");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
