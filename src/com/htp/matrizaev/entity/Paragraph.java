package com.htp.matrizaev.entity;

import com.htp.matrizaev.type.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Paragraph implements Component {

    private List<Component> paragraphContent = new ArrayList<>();
    private Type type = Type.PARAGRAPH;

    @Override
    public void write() {
        paragraphContent.get(0).write();
        paragraphContent.get(1).write();
        System.out.println();
    }

    @Override
    public Type determineType() {
        return type;
    }

    public void addComponent(Component component) {
        paragraphContent.add(component);
    }

    public void addComponent(Component ... components) {
        paragraphContent.addAll(Arrays.asList(components));
    }

    public void removeComponent(Component component) {
        for (Component component1 : paragraphContent) {
            if (component1.equals(component)) {
                paragraphContent.remove(component);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(paragraphContent, paragraph.paragraphContent) &&
                type == paragraph.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(paragraphContent, type);
    }
}
