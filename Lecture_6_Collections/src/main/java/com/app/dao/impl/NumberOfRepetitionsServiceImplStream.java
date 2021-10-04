package main.java.com.app.dao.impl;

import main.java.com.app.dao.CommonMethodsService;
import main.java.com.app.dao.NumberOfRepetitionsService;

import java.util.*;
import java.util.stream.Collectors;

public class NumberOfRepetitionsServiceImplStream implements NumberOfRepetitionsService {

    @Override
    public Map<String, Long> printAllWords(String words) {

        List<String> list = Arrays.asList(words.split("[()—,;:.!?\\s]+"));
        Map<String, Long> map = new HashMap<>();

        CommonMethodsService.commonMethod(list, map);

        map.forEach((k, v) ->  System.out.println("Слово = " + k + " Повторений = " + v));
        return null;
    }

    @Override
    public Map<String, Long> printUniqueWords(String words) {

        List<String> list = Arrays.asList(words.split("[()—,;:.!?\\s]+"));
        Map<String, Long> map = new HashMap<>();

        CommonMethodsService.commonMethod(list, map);

        map.entrySet().stream().forEach(entry -> {
            if (entry.getValue() > 1) {
                System.out.println("Слово = " + entry.getKey() + " Повторений = " + entry.getValue());
            }
        });
        return null;
    }

    @Override
    public List<String> sortedMap(String words) {

        List<String> list = Arrays.asList(words.split("[()—,;:.!?\\s]+"));
        Map<String, Long> map = new HashMap<>();

        CommonMethodsService.commonMethod(list, map);

        List<Map.Entry<String, Long>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        sorted.stream().forEach(entry -> {
            if (entry.getValue()> 1) {
                System.out.println("Слово = " + entry.getKey() + " Повторений = " + entry.getValue());
            }
        });
        return null;
    }
}
