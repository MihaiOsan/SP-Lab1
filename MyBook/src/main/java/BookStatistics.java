import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookStatistics implements Visitor{

    private int images;
    private int paragraps;
    private int tables;
    private int tablesOfContent;



    public BookStatistics() throws IOException {
        this.images = 0;
        this.paragraps = 0;
        this.tables = 0;
        this.tablesOfContent = 0;
    }


    @Override
    public void visitSection(Section s) throws IOException {
    }

    @Override
    public void visitTableOfContent(TableOfContent t) throws IOException {
    }

    @Override
    public void visitTable(Table t) throws IOException {
        tables+=1;
    }

    @Override
    public void visitParagraph(Paragraph p) throws IOException {
        paragraps+=1;
    }

    @Override
    public void visitImageProxy(ImageProxy i) throws IOException {
        images+=1;
    }

    @Override
    public void visitImage(Image i) throws IOException {
        images+=1;
    }

    public void printStatistics() throws IOException {
        System.out.println("Book statistics:");
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: " + tables);
        System.out.println("*** Number of paragraphs: " + paragraps);
    }
}
