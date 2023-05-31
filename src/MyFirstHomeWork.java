import java.util.Random;

public class MyFirstHomeWork {
    public static void main(String[] args) {
        // Створення по 1 екземпляру кожного примітивного типу
        byte myByte = 120;
        short myShort = 32060;
        int myInt = 214546434;
        long myLong = 222337203L;
        float myFloat = 3.1f;
        double myDouble = 5.1334334;
        char myChar = 'A';
        boolean MyBoolean = true;
        // Створення строки двома способами
        String str1 = new String("Hello, world!");
        String str2 = "Hello, world!";

        // Арифметичні операції з кожною змінною та виведення результату
        byte result1 = (byte)(myByte + 3);
        byte result2 = (byte)(myByte * 2);
        short result3 = (short)(myShort - 50);
        short result4 = (short)(myShort / 2);
        int result5 = myInt + 1000;
        int result6 = myInt / 3;
        long result7 = myLong - 500L;
        long result8 = myLong* 2;
        float result9 = myFloat + 1.1f;
        float result10 = myFloat / 2.0f;
        double result11 = myDouble - 0.12345678;
        double result12 = myDouble * 2.0;
        char result13 = (char)(myChar + 1);
        char result14 = (char)(myChar * 7);

        boolean result15 = !MyBoolean;
        boolean result16 = Math.random()*result1 ==result2;

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
        System.out.println("Result 6: " + result6);
        System.out.println("Result 7: " + result7);
        System.out.println("Result 8: " + result8);
        System.out.println("Result 9: " + result9);
        System.out.println("Result 10: " + result10);
        System.out.println("Result 11: " + result11);
        System.out.println("Result 12: " + result12);
        System.out.println("Result 13: " + result13);
        System.out.println("Result 14: " + result14);
        System.out.println("Result 15: " + result15);
        System.out.println("Result 16: " + result16);
        // Написати по 2 реляцонні та логічні операції кожного типу та вивести результат
        // реляцонні
        System.out.println(result5 == result6);
        System.out.println(result13 == result14);
        System.out.println(result1 != result2);
        System.out.println(result11 !=result12);
        System.out.println(result3 < result4);
        System.out.println(result9 < result10);
        System.out.println(result5 > result6);
        System.out.println(result7 > result8);
        System.out.println(result9 <= result10);
        System.out.println(result11 <= result12);
        System.out.println(result3 >= result4);
        System.out.println(result9 >= result10);
        // логічні
        System.out.println(result15 && result16);
        System.out.println(result5 > result6 && result7 > result8);
        System.out.println(result15 || result16);
        System.out.println(result1 > result2 || result5 > result8);
        System.out.println(!(result15 && result16));
        System.out.println(!(result15 || result16));
        // тернарні
        System.out.println(myInt < 1 ? "small" : "large");
        System.out.println(myInt % 1 == 0 ? "integer" : "decimal");
        // Створити змінну 1 та використовуючи інкремент та декремент вивести
        int variable = 1;
        System.out.println(variable);
        System.out.println(variable);
        System.out.println(variable--);
        System.out.println(variable++);
        System.out.println(++variable);
        System.out.println(--variable);
        System.out.println(variable);
        // Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями. Вивести парні числа.
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rand.nextInt(25);
        }
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j+" ");
            }
        }
        }
    }

