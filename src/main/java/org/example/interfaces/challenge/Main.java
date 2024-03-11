package org.example.interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Albertirsa KormanyAblak", UsageType.GOVERNMENT));
        mappables.add(new Building("Albertirsa Muvhaz", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Albertirsa Sportcsarnok", UsageType.SPORTS));


        mappables.add(new UtilityLine("Kolesz", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("szennyviz tisztito", UtilityType.WATER));
        for(var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
