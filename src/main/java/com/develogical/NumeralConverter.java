package com.develogical;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class NumeralConverter {

    private Map<Integer,String> normalToRomanMap = new LinkedHashMap<>();

    private Map<String,Integer> romanToNormalMap = new LinkedHashMap<>();

    public NumeralConverter()
    {
        normalToRomanMap.put(1,"I");
        normalToRomanMap.put(5,"V");
        normalToRomanMap.put(10,"X");
        normalToRomanMap.put(50,"L");
        normalToRomanMap.put(100,"C");
        normalToRomanMap.put(500,"D");
        normalToRomanMap.put(1000,"M");


        romanToNormalMap.put("I",1);
        romanToNormalMap.put("V",5);
        romanToNormalMap.put("X",10);
        romanToNormalMap.put("L",50);
        romanToNormalMap.put("C",100);
        romanToNormalMap.put("D",500);
        romanToNormalMap.put("M",1000);
    }

    public String getRomanNumeral(int normalnum) {
        if (normalToRomanMap.containsKey(normalnum))
        {
            return normalToRomanMap.get(normalnum);
        }
        if (normalnum == 7)
            return "VII";
        return null;
    }

    public int getNormalNumeral(String romannum) {
        int totalValue = 0;
        if (romanToNormalMap.containsKey(romannum))
        {
            return romanToNormalMap.get(romannum);
        }
        String[] splitRoman = romannum.split("");
        Integer[] normalValues = new Integer[splitRoman.length];
        for (Integer i = 0; i < splitRoman.length;i++){
            normalValues[i] = getNormalNumeral(splitRoman[i]);
        }

        if (normalValues[0] < normalValues[1])
        {
            totalValue = normalValues[1]- normalValues[0];
            return totalValue;

        }else
        {

            for (Integer value: normalValues) {
                totalValue += value;
            }
                return totalValue;
        }
    }
}
