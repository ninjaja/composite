package com.htp.matrizaev.entity;

import com.htp.matrizaev.type.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Article implements Component {

    private List<Component> articleContent = new ArrayList<>();
    private Type type = Type.ARTICLE;

    @Override
    public void write() {
        for (Component component : articleContent) {
            component.write();
        }
    }

    public void addComponent(Component component) {
        articleContent.add(component);
    }

    public void addComponent(Component ... components) {
        articleContent.addAll(Arrays.asList(components));
    }

    public void removeComponent(Component component) {
        for (Component component1 : articleContent) {
            if (component1.equals(component)) {
                articleContent.remove(component);
            }
        }
    }

    @Override
    public Type determineType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(articleContent, article.articleContent) &&
                type == article.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(articleContent, type);
    }
}
