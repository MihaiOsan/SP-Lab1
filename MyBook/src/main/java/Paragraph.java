public class Paragraph {
    private String title;

    public Paragraph() {
    }

    public Paragraph(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
