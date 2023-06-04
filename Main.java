import java. util. Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Yes");
        list.add("No");
        list.add("Hmm");


        System.out.println("Size: " + list.size());
        System.out.println(list.get(1));

        list.remove(1);

        System.out.println("Size: " + list.size());
        System.out.println(list.get(1));






    }
}










