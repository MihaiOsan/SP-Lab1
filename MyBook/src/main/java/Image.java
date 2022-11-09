public class Image implements Element{
    private String title;

    public Image() {
    }

    public Image(String title) {
        this.title = title;
    }


    public void print(){
        System.out.print(this.title);
    }
}
