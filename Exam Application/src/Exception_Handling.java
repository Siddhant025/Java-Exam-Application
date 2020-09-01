import javax.swing.*;
import java.awt.*;

public class Exception_Handling
{
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        Button b1=new Button();
        try
        {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            //System.out.println(e);
            System.out.println("\t");
            System.out.println(e.toString());
            System.out.println("\t");
            e.printStackTrace();
            System.out.println("\t");
            System.out.println(e.getMessage());
            System.out.println("\t");
        }
        finally {
            System.out.println("This is error free");
            System.out.println("\t\t");
        }


        try{
            //System.out.println("Sid");
            Demo.Demoproc();
            System.out.println("sid");
        }
        catch (IllegalAccessException e)
        {
            System.out.println("Caught "+ e);
            System.out.println("\t");
        }
        //System.out.println();
        catch (ArithmeticException e1)
        {
            System.out.println("general Exceptions");
            System.out.println("\t");
        }
        catch (Exception e2)
        {
            System.out.println("shvhshjsvjsbh");
        }
        int[] arr={5,2,3,7,1};
        int temp1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp1=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp1;
                }
            }
        }
        for(int val:arr)
        {
            System.out.println(val);
        }
    }
}
class Demo
{
    public static void Demoproc() throws IllegalAccessException
    {
        System.out.println("Inside Throwone");
        throw new IllegalAccessException("Demo");
        //System.out.println("sid");
    }
}
class Manage
{
    int savings;
    public Manage(int savings)
    {
        this.savings=savings;
        if(savings>1000)
        {
            System.out.println("Not allowed.");
        }
    }

}


