import java.util.*;
public class Lab31
    {
        public static void main(String []args)
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter n:");
            int n=s.nextInt();
            int p=1;
            for(int i=2; i<=n; i++)
            {
                    if(p<=0)
                {
                        p=p+i;
                        }
                    else
                {
                        p=p-i;
                        }
                }
            System.out.println(""+p);
            }
    }