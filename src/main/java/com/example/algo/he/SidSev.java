package com.example.algo.he;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://hackerearth.com/problem/algorithm/naughty-sid-and-sev-6/
 */
public class SidSev {
    public double getSafeHeight(double a, double H, double THETA_MAX) {
        double tanTheta = Math.tan(Math.toRadians(THETA_MAX));
        if(THETA_MAX == 45) tanTheta = 1;
        double res;
        if(H / tanTheta < a) {
            res = Math.ceil(H * H / (2 * tanTheta * a));
        } else {
            res = Math.ceil(H - 0.5 * (a * tanTheta));
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        SidSev sidSev = new SidSev();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Long t = Long.parseLong(line);
        for (Long i = 0L; i < t; i++) {
            line = br.readLine();
            String[] input = line.split("\\s+");
            double a = Double.parseDouble(input[0]);
            double H = Double.parseDouble(input[1]);
            double THETA_MAX = Double.parseDouble(input[2]);
            System.out.println(sidSev.getSafeHeight(a, H, THETA_MAX));
        }
    }
}
