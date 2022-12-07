public class TableOfContent implements Element {
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
    public void accept(Visitor v) {
        v.visitTableOfContent(this);
    }
}
