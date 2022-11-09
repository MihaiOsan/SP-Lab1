public class Paragraph implements Element{
    private String title;

    public Paragraph() {
    }

    public Paragraph(String title) {
        this.title = title;
    }


    public void print(){
        System.out.print(this.title);
    }
}
