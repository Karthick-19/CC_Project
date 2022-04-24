
import java.util.HashMap;

public class IDP {
    HashMap<String,String> login_info = new HashMap<String,String>();
    IDP(){
        login_info.put("Karthi","cruz");
        login_info.put("Mike","1001");
        login_info.put("Rick","1002");
    }

    protected HashMap<String,String> getLogininfo() {
        return login_info;
    }
}
