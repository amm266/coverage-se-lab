## Tests

test method encode:
testing JSONValue.toJSONString method by transferring an integer array to jsonString:

```java   
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
 ```

Effect on line coverage:\
org.json.simple: 17% to 29%\
JSONValue: 20% to 40%

test method jsonMap: testing JsonObject.toJSONString by putting a pair of key value and transfer JSONObject to json
string.

```java
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

```java
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

test method JSONParser: testing JSONParser.Parser by using it to pars an Integer array.

```java
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
```

Effect on line coverage:\
org.json.simple: 33% to 34%\
parser: 33% to 34%\
JSONParser: 14% to 15%

test method JsonMapParser: testing JSONValue.parseWithException using map json string input.

```java
    @Test
    public void testParsMap() throws Exception {
        System.out.println("======JsonMapParser======");

        Object o = JSONValue.parseWithException("{\"1\":2}");
        System.out.println("======parser output======");
        System.out.println(o.toString());
        System.out.println();
        assertEquals("{\"1\":2}" ,o.toString());
    }
```

Effect on line coverage:\
org.json.simple: 34% to 39%\
parser: 34% to 41%\
Yylex: 62% to 66%

## Details

#### `testEncode()`: This test method tests the JSONValue.toJSONString() method by passing an integer array as input and checking the generated JSON string against the expected output. It helps to test the encoding of an integer array to a JSON string and verifies that the generated JSON string matches the expected output.

#### `testJsonMap()`: This test method tests the JSONObject.toJSONString() method by creating a JSONObject with a key-value pair, converting it to a JSON string, and then comparing it with the expected output. It helps to test the creation of a JSON object with a key-value pair and verifies that the generated JSON string matches the expected output.

#### `testJsonArrayFloat()`: This test method tests the JSONArray.toJSONString() method by passing a float array as input and checking the generated JSON string against the expected output. It helps to test the encoding of a float array to a JSON string and verifies that the generated JSON string matches the expected output.

#### `testJsonParser()`: This test method tests the JSONParser.parse() method by parsing a JSON string containing an integer array and checking the parsed object against the expected output. It helps to test the parsing of a JSON string to an object and verifies that the parsed object potentially matches the expected output(by again converting it to string).

#### `testParsMap()`: This test method tests the JSONValue.parseWithException() method by parsing a JSON string containing a map and checking the parsed object against the expected output. It helps to test the parsing of a JSON string to an object and verifies that the parsed object matches the expected output(by again converting it to string).
