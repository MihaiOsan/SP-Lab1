public class Table implements Element{
    private String title;

    public Table() {
    }

    public Table(String title) {
        this.title = title;
    }


    public void print(){
        System.out.print(this.title);
    }
}
