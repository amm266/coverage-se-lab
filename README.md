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
JsonValue: 20% to 40%
