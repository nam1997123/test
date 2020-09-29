/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_nguyendacnam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NAMND
 */
public class Test_NguyenDacNam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test1();
        Test2();
        
    }

    static void Test1() {
        String result = null;
        System.out.println("Ban muon nhap vao bao nhieu phan tu: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextLine();
        }
        int size = arr.length;
        if (size == 0) {
            result = "";

        } else if (size == 1) {
            System.out.println(arr[0]);
        } else {
            Arrays.sort(arr);
            int length = arr[0].length();
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < length; i++) {
                if (arr[0].charAt(i) == arr[size - 1].charAt(i)) {
                    res.append(arr[0].charAt(i));
                } else {
                    break;
                }
            }
            result = res.toString();

        }
        System.out.println(result);
    }

    static void Test2() {
        System.out.println("Ban muon nhap vao bao nhieu phan tu: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] set = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ":");
            set[i] = sc.next();
        }

        System.out.println("[");
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("\t[");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(set[j] + ",");
                }
            }
            System.out.println("],");
        }
        System.out.println("]");
    }
   
}
