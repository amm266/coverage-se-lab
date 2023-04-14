test method encode:
testing JSONValue.toJSONString method by transferring an integer array to jsonString:

```    @Test
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
 ```

Effect on line coverage:\
org.json.simple: 17% to 29%\
JSONValue: 20% to 40%

test method jsonMap: testing JsonObject.toJSONString by putting a pair of key value and transfer JSONObject to json
string.

```
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
```

Effect on line coverage:\
org.json.simple: 29% to 32%\
JSONObject: 0% to 55%

test method jsonFloatArray: testing JSONArray.toJSONString using float arraty input.

```
public void testJsonArrayFloat() throws Exception {
        System.out.println("======JsonFloatArray======");

        float[] floats = {1.0f, 2.0f, 3.0f};
        String jsonString = JSONArray.toJSONString(floats);
        System.out.println("======encoded float array======");
        System.out.println(jsonString);
        System.out.println();
        assertEquals("[1.0,2.0,3.0]", jsonString);
    }
```

Effect on line coverage:\
org.json.simple: 32% to 33%\
JSONArray: 16% to 23%