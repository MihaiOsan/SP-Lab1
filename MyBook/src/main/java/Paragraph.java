import java.io.IOException;
import java.io.Serializable;

public class Paragraph implements Element, Serializable {
    private String title;
    private AlignStrategy alignStrategy;

    public Paragraph() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlignStrategy(AlignStrategy as){
        this.alignStrategy = as;
        as.render(this);
    }

    public Paragraph(String title) {
        this.title = title;
    }


    public void print(){
        System.out.print(this.title);
    }

    @Override
    public void accept(Visitor v) throws IOException {
        v.visitParagraph(this);
    }
}
