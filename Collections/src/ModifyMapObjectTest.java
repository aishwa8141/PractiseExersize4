import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ModifyMapObjectTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void modify() {
        //arrange
        Map<String,String> expected = new TreeMap<String,String>();
        expected.put("value1"," ");
        expected.put("value2","c++");


        //act
        ModifyMapObject object=new ModifyMapObject();

        Map<String,String> mapStr = new TreeMap<String,String>();
        Map<String,String> result = new TreeMap<String,String>();
        mapStr.put("value1","c++");
        mapStr.put("value2","java");

       result= object.modify(mapStr);




        //assert

         assertEquals(expected,result);


    }
}