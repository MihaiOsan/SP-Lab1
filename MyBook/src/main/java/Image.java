public class Image {
    private String title;

    public Image() {
    }

    public Image(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}