package com.aljosasolak.memento;

public class EditorState {
    private final String CONTENT;

    public EditorState(String content) {
        this.CONTENT = content;
    }
    public String getCONTENT() {
        return CONTENT;
    }
}
