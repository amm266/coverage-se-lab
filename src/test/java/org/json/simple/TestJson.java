/*
 * $Id: Test.java,v 1.1 2006/04/15 14:40:06 platform Exp $
 * Created on 2006-4-15
 */
package org.json.simple;

import static org.junit.Assert.assertEquals;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class TestJson {

    @Test
    public void testDecode() throws Exception {
        System.out.println("=======decode=======");

        String s = "[0,10]";
        Object obj = JSONValue.parse(s);
        JSONArray array = (JSONArray) obj;
        System.out.println("======the 2nd element of array======");
        System.out.println(array.get(1));
        System.out.println();
        assertEquals("10", array.get(1).toString());
    }

    @Test
    public void testEncode() throws Exception {
        System.out.println("=======encode=======");

        Integer[] ints = new Integer[2];
        ints[0] = 0;
        ints[1] = 10;
        String jsonString = JSONValue.toJSONString(ints);
        System.out.println("======encoded array======");
        System.out.println(jsonString);
        System.out.println();
        assertEquals("[0,10]", jsonString);
    }

    @Test
    public void testJsonMap() throws Exception {
        System.out.println("======JsonMap======");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(1, 2);
        String jsonString = jsonObject.toJSONString();
        System.out.println("======encoded map======");
        System.out.println(jsonString);
        System.out.println();
        assertEquals("{\"1\":2}", jsonString);
    }

    @Test
    public void testJsonArrayFloat() throws Exception {
        System.out.println("======JsonFloatArray======");

        float[] floats = {1.0f, 2.0f, 3.0f};
        String jsonString = JSONArray.toJSONString(floats);
        System.out.println("======encoded float array======");
        System.out.println(jsonString);
        System.out.println();
        assertEquals("[1.0,2.0,3.0]", jsonString);
    }

    @Test
    public void testJsonParser() throws Exception {
        System.out.println("======JsonParser======");

        JSONParser parser = new JSONParser();
        Object o = parser.parse("[1,2,3]");
        System.out.println("======parser output======");
        System.out.println(o.toString());
        System.out.println();
        assertEquals("[1,2,3]", o.toString());
    }

    @Test
    public void testParsMap() throws Exception {
        System.out.println("======JsonMapParser======");

        Object o = JSONValue.parseWithException("{\"1\":2}");
        System.out.println("======parser output======");
        System.out.println(o.toString());
        System.out.println();
        assertEquals("{\"1\":2}" ,o.toString());
    }

    @Test
    public void testJSONArrayCollection() {
        final ArrayList<String> testList = new ArrayList<String>();
        testList.add("First item");
        testList.add("Second item");
        final JSONArray jsonArray = new JSONArray(testList);

        assertEquals("[\"First item\",\"Second item\"]", jsonArray.toJSONString());
    }
}
