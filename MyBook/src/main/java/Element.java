import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.Serializable;

public interface Element {
    public void print();
    public void accept(Visitor v) throws IOException;

}
