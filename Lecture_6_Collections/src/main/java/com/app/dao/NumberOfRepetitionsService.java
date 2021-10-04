package main.java.com.app.dao;

import java.util.List;
import java.util.Map;

public interface NumberOfRepetitionsService {

    Map<String, Long> printAllWords(String words);
    Map<String, Long> printUniqueWords(String words);
    List<String> sortedMap(String words);
}
