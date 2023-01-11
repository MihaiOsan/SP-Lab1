import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Book extends Section implements Serializable {
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

    public void print(){
        String output = "Book: "  + super.getTitle() +
                "\n\nAuthors:\n";

        for (Author aut : this.authors){
            output = output + "Author: "+aut.toString()+"\n\n";
        }

        System.out.print(output);
        super.print();
    }

}
