package encryptdecrypt;

import java.util.Scanner;

public class Encrypter {

    String encrypted;

    Encrypter(Inputs inputs) {
        if (inputs.getMode().equals("enc")) {
            encrypt(inputs.getData(), inputs.getKey());
        } else if (inputs.getMode().equals("dec")) {
            encrypt(inputs.getData(), -inputs.getKey());
        }
        if (inputs.getOut().equals("")) {
            System.out.println(encrypted);
        } else {
            FileHandler.writeToFile(inputs.getOut(), encrypted);
        }
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
