import java.util.Scanner;

public class InputKeyboard {
    private Scanner scanner;
    
    public InputKeyboard() {
        this.scanner = new Scanner(System.in);
    }

    public String readLine() {
        return this.scanner.nextLine();
    }

    public int readInt() {
        return this.scanner.nextInt();
    }
}
