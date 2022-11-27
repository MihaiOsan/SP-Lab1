public class Paragraph implements Element{
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
}
