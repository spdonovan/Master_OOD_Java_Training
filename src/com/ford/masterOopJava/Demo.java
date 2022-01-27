package com.ford.masterOopJava;

import java.util.List;

public class Demo {

    private static Painter findCheapest1(double sqMeters, List<Painter> painters) {
        painters.stream()
                .filter(Painter::isAvailable)

    }
}
