import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ranNum=1+(int)(100*Math.random());//random number btw 1-100
        int k=5; //total chances for guessing
        System.out.println("guess any number between 1 and 100");
        System.out.println("You have "+k+" attempts to guess the number");

        for(int i=1;i<=k;i++)
        {
            int guess=sc.nextInt();
            System.out.println("Enter the guess:");
            if(guess==ranNum)
            System.out.println("Congratulations! you got it right 🎉🎉");
            else if(guess<ranNum)
            System.out.println("the number is greater than "+guess);
            else if(guess>ranNum)
            System.out.println("the number is less than "+guess);
            else
            System.out.println("enter valid number");



        }
        System.out.println("you have lost all your chances the number was "+ranNum);
       

    }
}