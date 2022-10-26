import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String title;
    private List<Element> elements;

    public SubChapter() {
        this.elements = new ArrayList<>();
    }

    public SubChapter(String title) {
        this();
        this.title = title;
    }

    public void createNewParagraph(String paragraphTitle){
        Paragraph p = new Paragraph(paragraphTitle);
        this.elements.add(p);
    }

    public void createNewImage(String imageTitle){
        Image i = new Image(imageTitle);
        this.elements.add(i);
    }

    public void createNewTable(String tableTitle){
        Table t = new Table(tableTitle);
        this.elements.add(t);
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "title='" + title + '\'' +
                ", \nelements=" + elements +
                '}';
    }

    public void print(){
        System.out.print(this.toString());
    }
}
