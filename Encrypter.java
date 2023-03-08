package encryptdecrypt;

import java.util.Scanner;

public class Encrypter {

    Scanner in = new Scanner(System.in);

    Encrypter() {
        String message = in.nextLine();
        int shift = in.nextInt();
        String encrypted = encrypt(message, shift);
        System.out.println(encrypted);
    }

    private String encrypt(String message, int shift) {
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            encrypted = encrypted + transformLetter(message.charAt(i), shift);
        }
        return encrypted;
    }

    private char transformLetter(char letter, int shift) {
        char result;
        if (letter >= 'a' && letter <= 'z') {
            result = (char)(letter + shift);
            if (result > 'z') {
                result = (char)(result - 26);
            }
        } else {
            result = letter;
        }
        return result;
    }

}
