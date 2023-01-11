import java.io.IOException;
import java.io.Serializable;

public class TableOfContent implements Element, Serializable {
    private String title;

    public TableOfContent() {
    }

    public TableOfContent(String title) {
        this.title = title;
    }


    public void print() {
        System.out.print(this.title);
    }

    @Override
    public void accept(Visitor v) throws IOException {
        v.visitTableOfContent(this);
    }
}
