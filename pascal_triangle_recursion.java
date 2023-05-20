import java.util.*;
public class pascal_triangle_recursion
{
    public static void main( String[] args)
    {
        System.out.println("Enter the number of lines");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        print(number);
    }

    public static int pascal_recursion(int i, int j)
    {
        if(j==0)
            return 1;
        else if(j==i)
            return 1;
        else
            return pascal_recursion(i-1,j-1)+ pascal_recursion(i-1,j);
    }

    public static void print(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(pascal_recursion(i,j)+" ");
            }
            System.out.println();
        }
    }
}