import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element, Picture, Serializable {

    private String url;
    private Image realImage;

    public ImageProxy() {
    }

    public ImageProxy(String url) {
        this.url = url;
    }

    public void print(){
        loadImage().print();
    }

    @Override
    public void accept(Visitor v) throws IOException {
        v.visitImageProxy(this);
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public Dimension getDim() {
        return null;
    }

    Image loadImage(){
        if (this.realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }
}
