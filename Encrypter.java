package encryptdecrypt;

import java.util.Scanner;

public class Encrypter {

    String encrypted;

    Encrypter(Inputs inputs) {
        boolean direction = inputs.getMode().equals("enc");
        boolean unicodeAlg = inputs.getAlg().equals("unicode");
        encrypt(inputs.getData(), inputs.getKey(), direction, unicodeAlg);
        presentResult(inputs.getOut());
    }

    private void encrypt(String message, int shift, boolean direction, boolean unicodeAlg) {
        encrypted = "";
        if (!direction) {
            shift = -shift;
        }
        for (int i = 0; i < message.length(); i++) {
            encrypted = encrypted + transformLetter(message.charAt(i), shift, unicodeAlg);
        }
    }

    private char transformLetter(char letter, int shift, boolean unicodeAlg) {
        char encrypted = letter;
        if (unicodeAlg) {
            encrypted = (char)(letter + shift);
        } else if (letter >= 'a' && letter <= 'z') {
            encrypted = (char)(letter + shift);
            if (encrypted > 'z') {
                encrypted = (char)(encrypted - 26);
            } else if (encrypted < 'a') {
                encrypted = (char)(encrypted + 26);
            }
        } else if (letter >= 'A' && letter <= 'Z') {
            encrypted = (char)(letter + shift);
            if (encrypted > 'Z') {
                encrypted = (char)(encrypted - 26);
            } else if (encrypted < 'A') {
                encrypted = (char)(encrypted + 26);
            }
        }
        return encrypted;
    }

    private void presentResult(String outFile) {
        if (outFile.equals("")) {
            System.out.println(encrypted);
        } else {
            FileHandler.writeToFile(outFile, encrypted);
        }
    }

}
