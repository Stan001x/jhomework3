package org.example;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 0; i < 100; i++)
        list.add(new Random().nextInt(0, 100));

for (int i = 0; i<100; i++)
    System.out.println(list.get(i));


for (int i=0; i<list.size(); i++)
    if (list.get(i)%2 == 0){
        list.remove(i);
        i=i-1;}

        System.out.println("-".repeat(20));

        for (int i = 0; i<list.size(); i++)
            System.out.println(list.get(i));
int sum = 0;

for (int i = 0; i< list.size(); i++)
    sum = sum + list.get(i);

int sr = sum/list.size();

        list.sort((o1, o2) -> o1 - o2);
        int m = list.get(0);
        int mm = list.get(list.size()-1);
        System.out.printf("Минимальное число: " + m);
        System.out.printf("\nМаксимальное число: " + mm);
        System.out.printf("\nСреднее значение: " + sr);

    }
}