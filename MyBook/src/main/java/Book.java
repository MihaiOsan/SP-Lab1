import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> authors;

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void addContent(Element e){
        this.add(e);
    }

    @Override
    public String toString() {
        String output = "Book: "  + super.getTitle() +
                "\n\nAuthors:\n";

        for (Author aut : this.authors){
            output = output + "Author: "+aut.toString()+"\n\n";
        }

        return output;
    }

    public void print(){
        System.out.print(this.toString());
        super.print();
    }
}
