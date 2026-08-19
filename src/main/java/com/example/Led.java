package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Led {
        


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ledsPorDigito = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        String linha = reader.readLine();
        if (linha == null) return;

        int n = Integer.parseInt(linha.trim());

        for (int i = 0; i < n; i++) {
            String numero = reader.readLine().trim();
            int totalLeds = 0;

            for (int j = 0; j < numero.length(); j++) {
                int digito = numero.charAt(j) - '0';
                totalLeds += ledsPorDigito[digito];
            }

            System.out.println(totalLeds + " leds");
        }
    }
}
