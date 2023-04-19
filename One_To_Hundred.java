//To predict numbers from 1 to 100.
import java.util.Scanner;

public class One_To_Hundred
{
    public static void main ()
    {
        int n=1, a=1, b=1, c=1, d=1, e=1, f=1, g=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello everyone.");
        System.out.println("Today I will play a number trick with you.");
        System.out.println("Think of any number between 1 and 100.");
        System.out.println("Now I will display a few lists to choose from.");
        System.out.println();
        System.out.println("Press any number to continue.");
        n=scan.nextInt();
        
        
        if(n>=0||n<=9)
        {
          System.out.println("Please check your number in the given list. Press 1 if your number is present, and 0 if it is not present.");
          System.out.println("LIST 1:\n28, 49, 12, 72, 38,\n08, 58, 50, 15, 59,\n34, 92, 77, 56, 86,\n24, 80, 68, 85, 05,\n64, 67, 31, 70, 48,\n78, 98, 29, 82, 57,\n89, 87, 30, 88, 84,\n90. ");
          a=scan.nextInt();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        if (a==0||a==1)
        {
          System.out.println("LIST 2:\n36, 100, 93, 83, 73,\n26, 94, 43, 47, 76,\n35, 55, 96, 16, 42,\n45, 52, 20, 65, 62,\n06, 69, 32, 54, 33, \n03, 60, 21, 40, 41,\n09, 46, 87, 30, 88,\n84, 90.");
          b=scan.nextInt();
        }
        else
        {   
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        if (b==0||b==1)
        {
          System.out.println("LIST 3:\n71, 81, 91, 74, 79,\n44, 25, 75, 37, 66,\n18, 22, 23, 14, 11,\n63, 52, 20, 65, 62,\n06, 69, 32, 54, 33,\n03, 60, 21, 40, 41,\n09, 46, 24, 80, 68,\n85, 05, 64, 67, 31,\n70, 48, 78, 98, 29,\n82, 57, 89.");
          c=scan.nextInt();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
         if (c==0||c==1)
        {
          System.out.println("LIST 4:\n02, 99, 07, 19, 01,\n39, 95, 61, 37, 66,\n18, 22, 23, 14, 11,\n63, 47, 76, 35, 55,\n96, 16, 42, 45, 33,\n03, 60, 21, 40, 41,\n09, 46, 15, 59, 34,\n92, 77, 56, 86, 70,\n48, 78, 98, 29, 82,\n57, 89");
          d=scan.nextInt();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        if (d==0||d==1)
        {
          System.out.println("LIST 5:\n97, 51, 27, 53, 01,\n39, 95, 61, 79, 44,\n25, 75, 23, 14, 11,\n63, 73, 26, 94, 43,\n96, 16, 42, 45, 06,\n69, 32, 54, 40, 41,\n09, 46, 38, 08, 58,\n50, 77, 56, 86, 05,\n64, 67, 31, 29, 82,\n57, 89, 90.");
          e=scan.nextInt();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        if (e==0||e==1)
        {
          System.out.println("LIST 6:\n04, 10, 27, 53, 07,\n19, 95, 61, 91, 74,\n25, 75, 18, 22, 11,\n63, 93, 83, 94, 43,\n35, 55, 42, 45, 65,\n62, 32, 54, 60, 21,\n09, 46, 12, 72, 58,\n50, 34, 92, 56, 86,\n68, 85, 67, 31, 78,\n98, 57, 89, 88, 84.");
          f=scan.nextInt();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        if (f==0||f==1)
        {
          System.out.println("LIST 7:\n17, 10, 51, 27, 99,\n19, 39, 61, 81, 74,\n44, 75, 66, 22, 14,\n63, 100, 83, 26, 43,\n76, 55, 16, 45, 20,\n62, 69, 54, 03, 21,\n41, 46, 49, 72, 08,\n50, 59, 92, 86, 80,\n85, 64, 31, 48, 98,\n82, 89, 30, 84.");
          g=scan.nextInt();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        if (g==0||g==1)
        {
          System.out.println();
        }
        else
        {
          System.out.println("***Invalid Number entered***");
          System.exit(0);
        }
        System.out.println();
        scan.close();
        int A=1000000*a;
        int B=100000*b;
        int C=10000*c;
        int D=1000*d;
        int E=100*e;
        int F=10*f;
        int G=g;
        int x=A+B+C+D+E+F+G;
        
        if(x==0)
        System.out.println("Your number is 13.");
        else if(x==1)
        System.out.println("Your number is 17.");
        else if(x==10)
        System.out.println("Your number is 04.");
        else if(x==11)
        System.out.println("Your number is 10.");
        else if(x==100)
        System.out.println("Your number is 97.");
        else if(x==101)
        System.out.println("Your number is 51.");
        else if(x==111)
        System.out.println("Your number is 27.");
        else if(x==110)
        System.out.println("Your number is 53.");
        else if(x==1000)
        System.out.println("Your number is 02.");
        else if(x==1001)
        System.out.println("Your number is 99.");
        else if(x==1010)
        System.out.println("Your number is 07.");
        else if(x==1011)
        System.out.println("Your number is 19.");
        else if(x==1100)
        System.out.println("Your number is 01.");
        else if(x==1101)
        System.out.println("Your number is 39.");
        else if(x==1110)
        System.out.println("Your number is 95.");
        else if(x==1111)
        System.out.println("Your number is 61.");
        else if(x==10000)
        System.out.println("Your number is 71.");
        else if(x==10001)
        System.out.println("Your number is 81.");
        else if(x==10010)
        System.out.println("Your number is 91.");
        else if(x==10011)
        System.out.println("Your number is 74.");
        else if(x==10100)
        System.out.println("Your number is 79.");
        else if(x==10101)
        System.out.println("Your number is 44.");
        else if(x==10110)
        System.out.println("Your number is 25.");
        else if(x==10111)
        System.out.println("Your number is 75.");
        else if(x==11000)
        System.out.println("Your number is 37.");
        else if(x==11001)
        System.out.println("Your number is 66.");
        else if(x==11010)
        System.out.println("Your number is 18.");
        else if(x==11011)
        System.out.println("Your number is 22.");
        else if(x==11100)
        System.out.println("Your number is 23.");
        else if(x==11101)
        System.out.println("Your number is 14.");
        else if(x==11110)
        System.out.println("Your number is 11.");
        else if(x==11111)
        System.out.println("Your number is 63.");
        else if(x==100000)
        System.out.println("Your number is 36.");
        else if(x==100001)
        System.out.println("Your number is 100.");
        else if(x==100010)
        System.out.println("Your number is 93.");
        else if(x==100011)
        System.out.println("Your number is 83.");
        else if(x==100100)
        System.out.println("Your number is 73.");
        else if(x==100101)
        System.out.println("Your number is 26.");
        else if(x==100110)
        System.out.println("Your number is 94.");
        else if(x==100111)
        System.out.println("Your number is 43.");
        else if(x==101000)
        System.out.println("Your number is 47.");
        else if(x==101001)
        System.out.println("Your number is 76.");
        else if(x==101010)
        System.out.println("Your number is 35.");
        else if(x==101011)
        System.out.println("Your number is 55.");
        else if(x==101100)
        System.out.println("Your number is 96.");
        else if(x==101101)
        System.out.println("Your number is 16.");
        else if(x==101110)
        System.out.println("Your number is 42.");
        else if(x==101111)
        System.out.println("Your number is 45.");
        else if(x==110000)
        System.out.println("Your number is 52.");
        else if(x==110001)
        System.out.println("Your number is 20.");
        else if(x==110010)
        System.out.println("Your number is 65.");
        else if(x==110011)
        System.out.println("Your number is 62.");
        else if(x==110100)
        System.out.println("Your number is 06.");
        else if(x==110101)
        System.out.println("Your number is 69.");
        else if(x==110110)
        System.out.println("Your number is 32.");
        else if(x==110111)
        System.out.println("Your number is 54.");
        else if(x==111000)
        System.out.println("Your number is 33.");
        else if(x==111001)
        System.out.println("Your number is 03.");
        else if(x==111010)
        System.out.println("Your number is 60.");
        else if(x==111011)
        System.out.println("Your number is 21.");
        else if(x==111100)
        System.out.println("Your number is 40.");
        else if(x==111101)
        System.out.println("Your number is 41.");
        else if(x==111110)
        System.out.println("Your number is 09.");
        else if(x==111111)
        System.out.println("Your number is 46.");
        else if(x==1000000)
        System.out.println("Your number is 28.");
        else if(x==1000001)
        System.out.println("Your number is 49.");
        else if(x==1000010)
        System.out.println("Your number is 12.");
        else if(x==1000011)
        System.out.println("Your number is 72.");
        else if(x==1000100)
        System.out.println("Your number is 38.");
        else if(x==1000101)
        System.out.println("Your number is 08.");
        else if(x==1000110)
        System.out.println("Your number is 58.");
        else if(x==1000111)
        System.out.println("Your number is 50.");
        else if(x==1001000)
        System.out.println("Your number is 15.");
        else if(x==1001001)
        System.out.println("Your number is 59.");
        else if(x==1001010)
        System.out.println("Your number is 34.");
        else if(x==1001011)
        System.out.println("Your number is 92.");
        else if(x==1001100)
        System.out.println("Your number is 77.");
        else if(x==1001110)
        System.out.println("Your number is 56.");
        else if(x==1001111)
        System.out.println("Your number is 86.");
        else if(x==1010000)
        System.out.println("Your number is 24.");
        else if(x==1010001)
        System.out.println("Your number is 80.");
        else if(x==1010010)
        System.out.println("Your number is 68.");
        else if(x==1010011)
        System.out.println("Your number is 85.");
        else if(x==1010100)
        System.out.println("Your number is 05.");
        else if(x==1010101)
        System.out.println("Your number is 64.");
        else if(x==1010110)
        System.out.println("Your number is 67.");
        else if(x==1010111)
        System.out.println("Your number is 31.");
        else if(x==1011000)
        System.out.println("Your number is 70.");
        else if(x==1011001)
        System.out.println("Your number is 48.");
        else if(x==1011010)
        System.out.println("Your number is 78.");
        else if(x==1011011)
        System.out.println("Your number is 98.");
        else if(x==1011100)
        System.out.println("Your number is 29.");
        else if(x==1011101)
        System.out.println("Your number is 82.");
        else if(x==1011110)
        System.out.println("Your number is 57.");
        else if(x==1011111)
        System.out.println("Your number is 89.");
        else if(x==1100000)
        System.out.println("Your number is 87.");
        else if(x==1100001)
        System.out.println("Your number is 30.");
        else if(x==1100010)
        System.out.println("Your number is 88.");
        else if(x==1100011)
        System.out.println("Your number is 84.");
        else if(x==1100100)
        System.out.println("Your number is 90.");        
        System.out.println();
        System.out.println("THANK YOU!!!");
        System.out.println("Program written and thought of by Parishkrat.");
    }
}