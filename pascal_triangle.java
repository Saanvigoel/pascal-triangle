import java.util.*;
public class pascal_triangle
{
    public static void main( String[] args)
    {
        System.out.println("Enter the number of lines");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int space=number;
        int n=1;
        for (int i=0;i<number;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            n=1;
            for (int k=0;k<=i;k++)
            {
                System.out.print(n+" ");
                n=n*(i-k)/(k+1);
            }
            space--;
            System.out.println();
        }
    }
}