import java.util.Map;
import java.util.TreeMap;

public class ModifyMapObject {

  public Map<String,String> modify(Map<String,String> stringMap){

      stringMap.replace("value2",stringMap.get("value1"));
      stringMap.replace("value1"," ");
      return stringMap;



  }


    public static void main(String[] args) {

        ModifyMapObject object=new ModifyMapObject();
        Map<String,String> mapStr = new TreeMap<String,String>();
        mapStr.put("value1","c++");
        mapStr.put("value2","java");
        System.out.println(mapStr);
        System.out.println(object.modify(mapStr));
    }

}
