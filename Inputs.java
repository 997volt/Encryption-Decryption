package encryptdecrypt;

public class Inputs {

    String mode = "enc";
    String data = "";
    int key = 0;

    Inputs(String[] args) {
        for (int i = 0; i < args.length; i+=2) {
            if (args[i].equals("-mode")) {
                mode = args[i+1];
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i+1]);
            } else if (args[i].equals("-data")) {
                data = args[i+1];
            }
        }
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public String getMode() {
        return mode;
    }
}
