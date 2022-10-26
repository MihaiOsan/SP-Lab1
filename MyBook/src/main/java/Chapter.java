import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<SubChapter> subChapters;

    public Chapter() {
        this.subChapters = new ArrayList<>();
    }

    public Chapter(String title) {
        this();
        this.title = title;
    }

    public int createSubChapter(String subChapterTitle){
        SubChapter c = new SubChapter(subChapterTitle);
        this.subChapters.add(c);
        return this.subChapters.indexOf(c);
    }

    public SubChapter getSubChapter(int index){
        return this.subChapters.get(index);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", \nsubChapters=" + subChapters +
                '}';
    }

    public void print(){
        System.out.print(this.toString());
    }
}
