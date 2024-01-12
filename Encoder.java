import java.util.Scanner;

public class Encoder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text : ");
        String message = scanner.next();
        message += scanner.nextLine();

        String encodedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            int chrASCII = (int) message.charAt(i);
            char encodedChar = (char)   (chrASCII  - 15);
            encodedMessage += encodedChar;
        }

        encodedMessage += "e>";
        System.out.println("Encoded Message = " + encodedMessage);
    }
}
