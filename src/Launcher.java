public class Launcher {
    static java.util.Scanner input = new java.util.Scanner(System.in);
    public static int fibo_rec(int n){
        int f_0 = 0;
        int f_1 = 1;
        if(n == 0){
            return f_0;
        }
        if (n==1){
            return f_1;
        }
        return fibo_rec(n-1)+fibo_rec(n-2);
    }
    public static int f_fibo(){
        System.out.println("Please enter a number from 0 to infinity");
        String s_number = input.nextLine();
        int number = Integer.parseInt(s_number);
        int result = fibo_rec(number);
        System.out.println(result);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Bienvenue!");
        String text;
        while (true) {
            text = input.nextLine();
            switch (text) {
                case "quit":
                    return;
                case "fibo":
                    f_fibo();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
