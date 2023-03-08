package encryptdecrypt;

import java.util.Scanner;

public class Encrypter {

    String operation;
    String message;
    int shift;
    String encrypted;

    Encrypter() {
        getInputs();
        if (operation.equals("enc")) {
            encrypt(message, shift);
        } else if (operation.equals("dec")) {
            encrypt(message, -shift);
        }
        System.out.println(encrypted);
    }

    private void getInputs() {
        Scanner in = new Scanner(System.in);
        operation = in.nextLine();
        message = in.nextLine();
        shift = in.nextInt();
    }

    private void encrypt(String message, int shift) {
        encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            encrypted = encrypted + transformLetter(message.charAt(i), shift);
        }
    }

    private char transformLetter(char letter, int shift) {
        return (char)(letter + shift);
    }

}
