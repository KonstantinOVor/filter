package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {
    public static Object[] filter(Object[] arr, Filter filter) {
        List<Object> resultList = new ArrayList<>();
        for (Object obj : arr) {
            resultList.add(filter.apply(obj));
        }
        return resultList.toArray();
    }
}
