import com.sun.net.httpserver.Authenticator;

import java.io.*;
import java.util.Scanner;

public class Chernovik {
//buffered System.in
    //printwriter System.out


    class Application {
        static Scanner scanner = new Scanner(System.in);
        static String filename;

        static PrintWriter pw;

        static {
            try {
                System.out.println("Введите имя файла: ");
                pw = new PrintWriter(filename = scanner.nextLine());
            } catch (FileNotFoundException e) {
                System.out.println("ERROR");
            }
        }


        private static void readData() throws IOException {
            System.out.println("Введите содержимое файла: ");

            pw.write(scanner.nextLine());
            pw.close();


        }

        private static void writeData() throws IOException {

            System.out.println("Был создан " + filename + ".txt"); // Почему не при вызове не запускается повторно scanner???


        }


    }

    public static void main(String[] args) throws IOException {
        Application.writeData();
        Application.readData();


    }

}



