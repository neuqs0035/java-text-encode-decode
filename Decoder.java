import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text : ");
        String message = scanner.next();

        String signal = message.substring(message.length() - 2);

        if(!signal.equals("e>")){
            System.out.println("This Text Is Not Encoded OR Not Encoded By This Encoder");
        }
        else{

            message += scanner.nextLine();

            String encodedMessage = "";

            for (int i = 0; i < message.length() -2; i++) {
                int chrASCII = (int) message.charAt(i);
                char encodedChar = (char) (chrASCII + 15 );
                encodedMessage += encodedChar;
            }

            System.out.println("Decoded Message = " + encodedMessage);
        }
    }
}
