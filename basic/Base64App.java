package basic;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String text = "Asyik Belajar Coding";

        String encode = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println(encode);

        byte[] decode = Base64.getDecoder().decode(encode);
        String newText = new String(decode);
        System.out.println(newText);
    }
}