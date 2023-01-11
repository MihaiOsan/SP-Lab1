import java.io.IOException;
import java.io.Serializable;

public class Table implements Element, Serializable {
    private String title;

    public Table() {
    }

    public Table(String title) {
        this.title = title;
    }


    public void print(){
        System.out.print(this.title);
    }

    @Override
    public void accept(Visitor v) throws IOException {
        v.visitTable(this);
    }
}
