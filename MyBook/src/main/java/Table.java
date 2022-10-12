public class Table {
    private String title;

    public Table() {
    }

    public Table(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
