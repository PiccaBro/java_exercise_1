public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue!");
        var input = new java.util.Scanner(System.in);
        String text;
        while (true) {
            text = input.nextLine();
            if (text.equals("quit")) {
                break;
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
