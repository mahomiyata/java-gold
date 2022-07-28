package chap3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReduceSample {
    public static void main(String[] args) {
        List<LinkedHashMap<String, Object>> chars = new ArrayList<>();
        LinkedHashMap<String,Object> a = new LinkedHashMap<>();
        a.put("greeting", "Hello");
        LinkedHashMap<String,Object> b = new LinkedHashMap<>();
        b.put("greeting", "Konnichiha");
        LinkedHashMap<String,Object> c = new LinkedHashMap<>();
        c.put("greeting", "Hello");
//        chars.add(a);
//        chars.add(b);
//        chars.add(c);
        String concat = (String) chars.stream().map(item -> item.get("greeting")).reduce("", (accum, value) -> accum + value.toString());
        System.out.println(concat);
    }
}
