package encryptdecrypt;

public class Encrypter {

    Encrypter() {
        System.out.println(encrypt("we found a treasure!"));
    }

    private String encrypt(String message) {
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            encrypted = encrypted + transformLetter(message.charAt(i));
        }
        return encrypted;
    }

    private char transformLetter(char letter) {
        char result = letter;
        if (letter >= 'a' && letter <= 'z'){
            result = (char)('z' + 'a' - letter);
        }
        return result;
    }

}
