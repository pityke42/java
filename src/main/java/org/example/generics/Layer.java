package org.example.generics;

import org.example.interfaces.challenge.Mappable;

import java.util.ArrayList;
import java.util.List;

public class Layer<T>{
    private List<T> elements = new ArrayList<>();
    public Layer(List<T> elements) {
        this.elements = elements;
    }
    public void renderLayer(T t){

    }
}
