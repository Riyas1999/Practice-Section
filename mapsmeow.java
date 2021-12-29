import java.util.HashMap;
import java.util.Map;

public class mapsmeow {
 public static void main(String[] args) {
     Map<String, String>map=new HashMap<>();
     map.put("name", "Riyas");
     map.put("name2", "Aaryan");
     //System.out.println(map.get("name2"));
     map.forEach((a,b)->System.out.println(a+":"+b));
        
    }
    
}
