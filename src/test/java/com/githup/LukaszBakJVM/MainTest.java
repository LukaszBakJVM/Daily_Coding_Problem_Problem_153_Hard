package com.githup.LukaszBakJVM;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void smallestDistance4() {
       //given
        String s = "mama";
        String s1 = "tata";
        String words = "Poszła mama do tomu a w domu tata śpi";
        //when
        int i = Main.smallestDistance(s, s1, words);
        //then
        assertEquals(5, i);
    }

    @Test
    void smallestDistance1() {
      //given
        String s = "hello";
        String s1 = "world";
        String words = "dog cat hello cat dog dog hello cat world";
        //when
        int i = Main.smallestDistance(s, s1, words);
        //then
        assertEquals(1, i);
    }
    @Test
    void smallestDistance3() {
        //given
        String s = "hello";
        String s1 = "world";
        String words = "dog cat hello cat dog cat world";
        //when
        int i = Main.smallestDistance(s, s1, words);
        //then
        assertEquals(3, i);
    }

}