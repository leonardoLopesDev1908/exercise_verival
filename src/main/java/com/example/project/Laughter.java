package com.example.project;

public class Laughter {
    
    public char exercise(String entrada) {
        if (entrada == null) return 'N';
            StringBuilder vogais = new StringBuilder();
            for (char c : entrada.trim().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais.append(c);
                }
            }

            if (ehPalindromo(vogais.toString())) {
                return 'S';
            } else {
                return 'N';
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
