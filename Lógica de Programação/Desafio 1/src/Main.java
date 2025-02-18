import com.google.gson.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valueOne,valueTwo,valueThree = 0;
        Scanner scanner = new Scanner(System.in);

        valueOne = scanner.nextInt(); // Read the entire line of input
        valueTwo = scanner.nextInt(); // Read the entire line of input
        valueThree = scanner.nextInt(); // Read the entire line of input

        System.out.println(valueOne);
        System.out.println(valueTwo);
        System.out.println(valueThree);

        valueTwo = valueThree;
        valueThree = valueOne;
        valueOne = valueTwo;

        System.out.println("\n");
        System.out.println(valueOne);
        System.out.println(valueTwo);
        System.out.println(valueThree);

    }
}