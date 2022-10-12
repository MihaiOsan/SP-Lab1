import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Paragraph> paragraps;
    private List<Image> images;
    private List<Table> tables;

    public Book() {
        this.images = new ArrayList<>();
        this.paragraps = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public Book(String title) {
        this();
        this.title = title;
    }

    public void createNewParagraph(String paragraphTitle){
        Paragraph p = new Paragraph(paragraphTitle);
        this.paragraps.add(p);
    }

    public void createNewImage(String imageTitle){
        Image i = new Image(imageTitle);
        this.images.add(i);
    }

    public void createNewTable(String tableTitle){
        Table t = new Table(tableTitle);
        this.tables.add(t);
    }

    @Override
    public String toString() {
        return "Book{\n " +
                "title=" + title +
                ",\n paragraps=" + paragraps +
                ",\n images=" + images +
                ",\n tables=" + tables +
                "\n}";
    }

    public void print(){
        System.out.print(this.toString());
    }
}
