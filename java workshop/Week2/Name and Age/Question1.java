import java.util.Scanner;

public class Question1
{
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("My name is " + name);
    }
}