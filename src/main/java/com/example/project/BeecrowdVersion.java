package com.example.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BeecrowdVersion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada = br.readLine();
        if (entrada == null) {
            return;
        }

        StringBuilder vogais = new StringBuilder();
        for (char c : entrada.trim().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais.append(c);
            }
        }

        if (ehPalindromo(vogais.toString())) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
    
    private static boolean ehPalindromo(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}