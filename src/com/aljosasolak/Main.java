package com.aljosasolak;

import com.aljosasolak.memento.Editor;
import com.aljosasolak.memento.History;

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

        System.out.println("first");
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}