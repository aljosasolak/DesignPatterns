package com.aljosasolak;

import com.aljosasolak.memento.Editor;
import com.aljosasolak.memento.History;
import com.aljosasolak.state.Canvas;
import com.aljosasolak.state.Eraser;
import com.aljosasolak.state.SelectionTool;
import com.aljosasolak.state.abuse.Stopwatch;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new Eraser());
        canvas.mouseUp();
        canvas.mouseDown();

        var stopwach = new Stopwatch();
        stopwach.click();
        stopwach.click();
        stopwach.click();
        stopwach.click();

    }
}