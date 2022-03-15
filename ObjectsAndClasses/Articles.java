package ObjectsAndClasses;

import java.util.Scanner;

public class Articles {
    static class Article{
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }
        public void setTitle(String newTitle) {
            this.title = newTitle;
        }
        public String getContent() {
            return this.content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
       Article firstArticle = new Article(data[0], data[1], data[2]);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(": ");

        for (int i = 0; i < n; i++) {
            if (input[0].equals("Edit")){
                firstArticle.setContent(input[1]);
            } else if (input[0].equals("ChangeAuthor")){
                firstArticle.setAuthor(input[1]);
            } else if (input[0].equals("Rename")){
                firstArticle.setTitle(input[1]);
            }
            input = scanner.nextLine().split(": ");
        }

        System.out.println(firstArticle);






    }
}
