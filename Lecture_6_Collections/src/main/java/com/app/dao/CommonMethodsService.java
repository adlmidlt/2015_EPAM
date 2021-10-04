package main.java.com.app.dao;

import java.util.List;
import java.util.Map;

public interface CommonMethodsService {

    static void commonMethod(List<String> list, Map<String, Long> map) {

        list.forEach(lists -> {
            if (!map.containsKey(lists)) {
                map.put(lists, 1L);
            } else {
                map.put(lists, map.get(lists) + 1);
            }
        });
    }
}
