package encryptdecrypt;

public class Inputs {

    int key = 0;
    String mode = "enc";
    String data = "";
    String in = "";
    String out = "";

    Inputs(String[] args) {
        for (int i = 0; i < args.length; i+=2) {
        if (args[i].equals("-mode")) {
            mode = args[i+1];
        } else if (args[i].equals("-key")) {
            key = Integer.parseInt(args[i+1]);
        } else if (args[i].equals("-data")) {
            data = args[i+1];
        } else if (args[i].equals("-in")) {
            in = args[i+1];
        } else if (args[i].equals("-out")) {
            out = args[i+1];
        }
    }
}

    public int getKey() {
        return key;
    }

    public String getData() {
        String output = "";
        if (!data.equals("")) {
            output = data;
        } else {
            output = FileHandler.readFromFile(in);
        }
        return output;
    }

    public String getMode() {
        return mode;
    }

    public String getOut() {
        return out;
    }
}
