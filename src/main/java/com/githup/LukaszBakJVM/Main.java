package com.githup.LukaszBakJVM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int i = smallestDistance("mama", "tata", "Poszła mama to i w domu tata znalazła mama coś");
        System.out.println(i);

    }
public static int smallestDistance(String s,String s2 ,String words){
      List<Integer> countS=new ArrayList<>();
      List<Integer>countS2=new ArrayList<>();

    List<String> strings = Arrays.stream(words.split("[ ]")).toList();
    for (int i = 0; i < strings.size(); i++) {
        if (strings.get(i).equals(s)){
            countS.add(i);
        } else if (strings.get(i).equals(s2)) {
            countS2.add(i);

        }

    }
    int findLenght=countS2.get(0)-countS.get(0);
    for (int i = 0; i < countS.size(); i++) {
        for (int j = 0; j <countS2.size() ; j++) {
            if (countS2.get(j)-countS.get(i)<findLenght&&countS2.get(j)-countS.get(i)>0){
                findLenght=countS2.get(j)-countS.get(i);
            }

        }

    }
    return findLenght-1;

        }



}

