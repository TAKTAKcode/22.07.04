package com.tak.random;

import java.util.Random;
import java.util.Scanner;


public class RandomPlusMinus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" 정숫값 : ");
        int x = sc.nextInt();   //x에 정숫값을 대입

        System.out.println("입력 값의 +-5 범위의 난수를 생성했습니다.");
        System.out.println("값은 : " + (x - 5 + random.nextInt(11)) + "입니다.");
    }
}
