package com.htp.matrizaev.entity;

import com.htp.matrizaev.type.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Sentence implements Component {

    private List<Component> sentenceContent = new ArrayList<>();
    private Type type = Type.SENTENCE;

    @Override
    public void write() {
        sentenceContent.get(0).write();
        System.out.print(": ");
        sentenceContent.get(1).write();
        System.out.print(". ");

    }

    @Override
    public Type determineType() {
        return type;
    }

    public void addComponent(Component component) {
        sentenceContent.add(component);
    }

    public void addComponent(Component ... components) {
        sentenceContent.addAll(Arrays.asList(components));
    }

    public void removeComponent(Component component) {
        for (Component component1 : sentenceContent) {
            if (component1.equals(component)) {
                sentenceContent.remove(component);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(sentenceContent, sentence.sentenceContent) &&
                type == sentence.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(sentenceContent, type);
    }
}
