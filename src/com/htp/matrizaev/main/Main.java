package com.htp.matrizaev.main;

import com.htp.matrizaev.entity.Article;
import com.htp.matrizaev.entity.Lexeme;
import com.htp.matrizaev.entity.Paragraph;
import com.htp.matrizaev.entity.Sentence;

public class Main {

    public static void main(String[] args) {

        //creating instances:

        Lexeme lexeme1 = new Lexeme("Belarus");
        Lexeme lexeme2 = new Lexeme("Minsk");
        Lexeme lexeme3 = new Lexeme("Germany");
        Lexeme lexeme4 = new Lexeme("Berlin");
        Lexeme lexeme5 = new Lexeme("Great Britain");
        Lexeme lexeme6 = new Lexeme("London");
        Lexeme lexeme7 = new Lexeme("Spain");
        Lexeme lexeme8 = new Lexeme("Madrid");
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Sentence sentence3 = new Sentence();
        Sentence sentence4 = new Sentence();
        Paragraph paragraph1 = new Paragraph();
        Paragraph paragraph2 = new Paragraph();
        Article article = new Article();

        //adding instances to relevant Composites:

        sentence1.addComponent(lexeme1, lexeme2);
        sentence2.addComponent(lexeme3, lexeme4);
        sentence3.addComponent(lexeme5, lexeme6);
        sentence4.addComponent(lexeme7, lexeme8);

        paragraph1.addComponent(sentence1, sentence2);
        paragraph2.addComponent(sentence3, sentence4);

        article.addComponent(paragraph1, paragraph2);

        //executing main component:

        article.write();
    }
}
