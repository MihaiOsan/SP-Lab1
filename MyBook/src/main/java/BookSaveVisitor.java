import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookSaveVisitor implements Visitor {

    List<Element> elements;
    private ObjectMapper mapper;
    private File file;

    public BookSaveVisitor() throws IOException {
        mapper = new ObjectMapper();
        file = new File("book.json");
        elements = new ArrayList<>();
    }

    @Override
    public void visitSection(Section s) throws IOException {
    }

    @Override
    public void visitTableOfContent(TableOfContent t) throws IOException {
        elements.add(t);
    }

    @Override
    public void visitTable(Table t) throws IOException {
        elements.add(t);
    }

    @Override
    public void visitParagraph(Paragraph p) throws IOException {
        elements.add(p);
    }

    @Override
    public void visitImageProxy(ImageProxy i) throws IOException {
        elements.add(i);
    }

    @Override
    public void visitImage(Image i) throws IOException {
        elements.add(i);
    }

    public void saveBook() throws IOException {
        mapper.writeValue(file,elements);
    }
}
