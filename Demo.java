import java.util.Scanner;

class Demo
{

    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:");
        a = sc.nextInt();

        System.out.println("Enter second value:");
        b = sc.nextInt();

        c = a + b;
        System.out.println("Your answer is : " + c);
        



    }
}