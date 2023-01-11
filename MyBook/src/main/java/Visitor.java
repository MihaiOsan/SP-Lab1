import org.json.JSONException;

import java.awt.print.Book;
import java.io.IOException;

public interface Visitor {


    void visitSection(Section s) throws IOException;
    void visitTableOfContent(TableOfContent t) throws IOException;
    void visitTable(Table t) throws IOException;
    void visitParagraph(Paragraph p) throws IOException;
    void visitImageProxy(ImageProxy i) throws IOException;
    void visitImage(Image i) throws IOException;

}
