package com.salakommerceb;

import org.junit.jupiter.api.Test;


public class CategoryTest {
    @Test
    public void improvedSwitch() {
        String fruit = "APPLE";
        String text = switch (fruit) {
            case "APPLE", "PEAR" -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case "ORANGE", "AVOCADO" -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
        String s = "";
        if( s instanceof String){
            System.out.println();
        }
    }
}
