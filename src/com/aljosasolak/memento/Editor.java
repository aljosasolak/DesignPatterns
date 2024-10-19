package com.aljosasolak.memento;

import java.util.Stack;

public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content  ;
    }
    public String getContent() {
        return this.content;
    }
    public EditorState createState() {
        return new EditorState(content);
    }
    public void restore(EditorState state) {
        this.content = state.getCONTENT();
    }
}