package org.example.generics.extras.util;

import org.example.generics.extras.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem>{
    private List<T> items;
    public QueryList(List<T> items){
        this.items = items;
    }
    public List<T> getMatches(String field, String value){
        List<T> matches = new ArrayList<>();
        for(var item : items){
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }
    public static <S extends QueryItem>List<S> getMatches(List<S> items, String field, String value){
        List<S> matches = new ArrayList<>();
        for(var item : items){
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }
}
