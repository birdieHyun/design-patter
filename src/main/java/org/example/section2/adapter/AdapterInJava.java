package org.example.section2.adapter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c"); // 배열을 리스트로 변환

        Enumeration<String> enumeration = Collections.enumeration(list);

        ArrayList<String> listed = Collections.list(enumeration);

        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(inputStreamReader);
    }
}
