public class Image implements Element{
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

    public void print(){
        System.out.print(this.toString());
    }
}
