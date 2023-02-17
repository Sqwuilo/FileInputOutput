
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        fileRead(line);
        FileConsole();
    }

    public static void fileRead(String line) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test1.txt");
            fileOutputStream.write(line.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
        }
    }

    public static void FileConsole() {
        String line2 = "";

        try {
            FileInputStream fileInputStream = new FileInputStream("test1.txt");

            int pos;

            while ((pos = fileInputStream.read()) != -1) {
                line2 += (char) pos;
            }
            fileInputStream.close();
        } catch (Exception e) {
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test1.txt");
            String lineMass[];
            int sum = 0;
            if (line2.contains("-")) {
                lineMass = line2.split("-");
                for (int i = 0; i < lineMass.length; i++) {
                    sum = Integer.parseInt(lineMass[0]) - Integer.parseInt(lineMass[1]);
                }
                String lines = sum + "";
                fileOutputStream.write(lines.getBytes(StandardCharsets.UTF_8));
            } else if (line2.contains("+")) {
                lineMass = line2.split("\\+");
                for (int i = 0; i < lineMass.length; i++) {
                    sum = Integer.parseInt(lineMass[0]) + Integer.parseInt(lineMass[1]);
                }
                String lines = sum + "";
                fileOutputStream.write(lines.getBytes(StandardCharsets.UTF_8));
            } else if (line2.contains("*")) {
                lineMass = line2.split("\\*");
                for (int i = 0; i < lineMass.length; i++) {
                    sum = Integer.parseInt(lineMass[0]) * Integer.parseInt(lineMass[1]);
                }
                String lines = sum + "";
                fileOutputStream.write(lines.getBytes(StandardCharsets.UTF_8));
            } else if (line2.contains("/")){
                lineMass = line2.split("/");
                for (int i = 0; i < lineMass.length; i++) {
                    sum = Integer.parseInt(lineMass[0]) / Integer.parseInt(lineMass[1]);
                }
                String lines = sum + "";
                fileOutputStream.write(lines.getBytes(StandardCharsets.UTF_8));
            }else System.out.println("ERROR");
        }catch (Exception e){

        }

    }
}