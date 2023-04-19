import java.awt.datatransfer.SystemFlavorMap;
import java.util.*;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,finum,x,i=0,bigrand,smarand,eqrand,diff,losrand;
        boolean wl=false;
        String sma1="♥Your number is smaller than mine, Woohoo♥!";
        String sma2="♦Your number is smaller than mine, you loser!♦";
        String sma3="♣Your luck never helps you, your number is smaller!♣";
        String sma4="♠Your number is still smaller, believe me!♠";
        String sma5="•I swear your number is smaller than mine!•";
        String big1="♥Your number is greater than mine, Woohoo♥!";
        String big2="♦Your number is greater than mine, you loser!♦";
        String big3="♣Your luck never helps you, your number is greater!♣";
        String big4="♠Your number is still greater, believe me!♠";
        String big5="•I swear your number is greater than mine!•";
        String eq1="Oh no! So you finally won :( ";
        String eq2="♦Nice game :(♦";
        String eq3="♣You played better than I expected :(";
        String eq4="♠I pitied you this time, will not do so next time '_'";
        String eq5="Congratulations to me, for losing from such a nerd •_•";
        String loss1="Oh yes! So you lost, HaHa ☻";
        String loss2="Nice game, Better luck next time ☻";
        String loss3="You played far worse than I expected ☻";
        String loss4="Go get some brains, if they're being sold by some shop ☻";
        String loss5="Congratulations to me, for winning from such a nerd •_•";
        finum=(int)(100*Math.random()+1);
        System.out.println("Hello, Welcome to another nice game-cum-program.");
        System.out.println("Enter your name.");
        String name=sc.nextLine();
        System.out.println("If I remember clearly, last time I guessed the number you chose, so now it's your turn! ");
        System.out.println("So the game is pretty simple. I will choose a random number between 1 and 100. All you have to do is guess my number in 10 attempts and\nI will give you instructions if your number us greater than or lesser than my number.");
        System.out.println("NOTE: My number shall be different every time, so don't be under the impression of cheating with me :)");
        System.out.println("Do you find the game easier than you expected? Choose your Difficulty level! Type any One number from the following.");
        System.out.println("1---Very Easy\n2---Easy\n3---Medium\n4---Hard\n5---Pro\n6---Legends only");
        diff=sc.nextInt();
        if(diff==1)
            i=0;
        else if(diff==2)
            i=3;
        else if(diff==3)
            i=5;
        else if(diff==4)
            i=7;
        else if(diff==5)
            i=10;
        else if(diff==6)
            i=12;
        else
            System.exit(0);
        System.out.println("According to your chosen level, you will get "+(15-i)+" attempts ☻");
        System.out.println("Press any number to start or press '0' to exit (Courageless ones who chose Legends level will now exit the game and choose easy ☺)");
        x=sc.nextInt();
        if(x>0) {
            while (i < 15) {
                System.out.println("Select your number!");
                num = sc.nextInt();
                if (num > finum) {
                    bigrand = (int) (4 * Math.random() + 1);
                    if (bigrand == 1)
                        System.out.println(big1 + "\n" + (14 - i) + " chances left!");
                    else if (bigrand == 2)
                        System.out.println(big2 + "\n" + (14 - i) + " chances left!");
                    else if (bigrand == 3)
                        System.out.println(big3 + "\n" + (14 - i) + " chances left!");
                    else if (bigrand == 4)
                        System.out.println(big4 + "\n" + (14 - i) + " chances left!");
                    else if (bigrand == 5)
                        System.out.println(big5 + "\n" + (14 - i) + " chances left!");
                } else if (num < finum) {
                    smarand = (int) (4 * Math.random() + 1);
                    if (smarand == 1)
                        System.out.println(sma1 + "\n" + (14 - i) + " chances left!");
                    else if (smarand == 2)
                        System.out.println(sma2 + "\n" + (14 - i) + " chances left!");
                    else if (smarand == 3)
                        System.out.println(sma3 + "\n" + (14 - i) + " chances left!");
                    else if (smarand == 4)
                        System.out.println(sma4 + "\n" + (14 - i) + " chances left!");
                    else if (smarand == 5)
                        System.out.println(sma5 + "\n" + (14 - i) + " chances left!");
                } else {
                    eqrand = (int) (5 * Math.random() + 1);
                    if (eqrand == 1)
                        System.out.println(eq1);
                    else if (eqrand == 2)
                        System.out.println(eq2);
                    else if (eqrand == 3)
                        System.out.println(eq3);
                    else if (eqrand == 4)
                        System.out.println(eq4);
                    else if (eqrand == 5)
                        System.out.println(eq5);
                    wl = true;
                    break;
                }
                i++;
            }

            if (wl == true) {
                System.out.println(name + " won from Computer with " + (14 - i) + " attempt(s) remaining.");
                System.out.println("Bye-Bye, See ya' soon");
            } else {
                System.out.println("The correct number was " + finum + ", hehe.");
                System.out.println(name + " lost from Computer. Lets see what our winner, the computer says to you:");
                losrand = (int) (4 * Math.random() + 1);
                if (losrand == 1)
                    System.out.println(loss1);
                else if (losrand == 2)
                    System.out.println(loss2);
                else if (losrand == 3)
                    System.out.println(loss3);
                else if (losrand == 4)
                    System.out.println(loss4);
                else if (losrand == 5)
                    System.out.println(loss5);
                System.out.println("Bye-Bye, See ya' soon");
            }
            System.exit(0);
        }
        else
            System.exit(0);
    }
}