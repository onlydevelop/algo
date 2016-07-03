package com.example.algo.he.io;

import java.util.Scanner;

/*
    https://www.hackerearth.com/problem/algorithm/roy-and-profile-picture/
 */
public class RoyPicture {

    public String showResponse(int L, int N, int W, int H) {
        if(W < L || H < L) {
            return "UPLOAD ANOTHER";
        } else if(W == H) {
            return "ACCEPTED";
        } else {
            return "CROP IT";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            int W = scanner.nextInt();
            int H = scanner.nextInt();
            System.out.println(new RoyPicture().showResponse(L, N, W, H));
        }
    }
}
