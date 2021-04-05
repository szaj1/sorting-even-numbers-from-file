package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scan = new Scanner(inStream);
        while (scan.hasNextInt()){
            int number = scan.nextInt();
            if (number % 2 == 0) {
                list.add(number);
            }
        }

        reader.close();
        inStream.close();
        scan.close();

        Collections.sort(list);
        for (int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
