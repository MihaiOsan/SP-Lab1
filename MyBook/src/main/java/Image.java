import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String title;

    public Image() {
    }

    public Image(String title) {
        this.title = title;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void print(){
        System.out.print(this.title);
    }

    @Override
    public void accept(Visitor v) {
        v.visitImage(this);
    }

    @Override
    public String getUrl() {
        return this.title;
    }

    @Override
    public Dimension getDim() {
        return null;
    }
}
