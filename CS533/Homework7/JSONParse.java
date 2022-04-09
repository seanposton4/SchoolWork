import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONParse {
    public static void main(String[] args) throws Exception {
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\fagge\\Documents\\NetBeansProjects\\533Homework7\\src\\JSONExample.json"));
        JSONObject jo = (JSONObject)obj;
        
        String semo_id = (String)jo.get("semo_id");
        String firstName = (String)jo.get("firstName");
        String lastName = (String)jo.get("lastName");
        String semester = (String)jo.get("semester");
        
        Map courses = (Map)jo.get("course");
        JSONArray approach = (JSONArray)jo.get("approach");
        
        System.out.println(semo_id);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(semester);
        
        Iterator<Map.Entry> courseIt = courses.entrySet().iterator();
        while (courseIt.hasNext()) {
            Map.Entry pair = courseIt.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        
        Iterator approachIt = approach.iterator();
        while (approachIt.hasNext()) {
            courseIt = ((Map)approachIt.next()).entrySet().iterator();
            while (courseIt.hasNext()) {
                Map.Entry pair = courseIt.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
