import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Serializable {
    private String title;
    private List<Element> childs;

    public Section() {
        this.childs = new ArrayList<>();
    }

    public Section(String title) {
        this();
        this.title = title;
    }

    public void add(Element e){
        this.childs.add(e);
    }

    public void remove(Element e){
        this.childs.remove(e);
    }

    public Element get(int i) {
        return this.get(i);
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getChilds() {
        return childs;
    }

    public void print(){
        if (!(this instanceof Book))
            System.out.print(this.title+"\n");
        for (Element el : this.childs){
            if (el instanceof Image)
                System.out.print("Image with name: ");
            else if (el instanceof Paragraph) {
                System.out.print("Paragraph: ");
            }
            else if (el instanceof Table) {
                System.out.print("Table: ");
            }
            el.print();
            System.out.print("\n");
        }
    }

    @Override
    public void accept(Visitor v) throws IOException {
        v.visitSection(this);
        for (Element el : this.childs){
            el.accept(v);
        }
    }
}