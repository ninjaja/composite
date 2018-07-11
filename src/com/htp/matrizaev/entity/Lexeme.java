package com.htp.matrizaev.entity;

import com.htp.matrizaev.type.Type;

public class Lexeme implements Component {

    private String content;
    private Type type = Type.WORD;

    public Lexeme(String content) {
        this.content = content;
    }

    @Override
    public void write() {
        System.out.print(content);
    }

    @Override
    public Type determineType() {
        return type;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
