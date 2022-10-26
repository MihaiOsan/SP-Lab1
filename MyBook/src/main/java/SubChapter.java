import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String title;
    private List<Paragraph> paragraps;
    private List<Image> images;
    private List<Table> tables;

    public SubChapter() {
        this.images = new ArrayList<>();
        this.paragraps = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public SubChapter(String title) {
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
        return "SubChapter{" +
                "title='" + title + '\'' +
                ", \nparagraps=" + paragraps +
                ", \nimages=" + images +
                ", \ntables=" + tables +
                '}';
    }

    public void print(){
        System.out.print(this.toString());
    }
}
