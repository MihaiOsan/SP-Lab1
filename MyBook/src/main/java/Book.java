import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters;

    public Book() {
        this.chapters = new ArrayList<>();
    }

    public Book(String title) {
        this();
        this.title = title;
    }

    public void addAuthor(Author author){
        this.author = author;
    }

    public int createChapter(String chapterTitle){
        Chapter c = new Chapter(chapterTitle);
        this.chapters.add(c);
        return this.chapters.indexOf(c);
    }

    public Chapter getChapter(int index){
        return this.chapters.get(index);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", \nauthor=" + author +
                ", \nchapters=" + chapters +
                '}';
    }

    public void print(){
        System.out.print(this.toString());
    }
}
