package controller;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {

    public static final String UPDATE="back/update";

    public static Map<String,String> turn(Map<String,String[]> map) {

        Map<String,String> result = new HashMap<String,String>();

        for(Map.Entry<String,String[]> entry: map.entrySet()) {

            String[] value = entry.getValue();

            StringBuilder temp = new StringBuilder();

            for(String a:value) {

                temp.append(a);
            }
            result.put(entry.getKey(),temp.toString());
        }

        return result;
    }
}
