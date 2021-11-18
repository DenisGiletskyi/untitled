package homeWork8ItvdnBook;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        title.setTitle("War and Peace ");
        System.out.println(title.getTitle());

        author.setAuthor("Lev Nikolaevich Tolstoy");
        System.out.println(author.getAuthor());

        content.setContent("Tom 1 \nTom 2 \nTom 3");
        System.out.println(content.getContent());
    }
}
