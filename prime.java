import java.util.*;
class Pr
{
    int value,num;
    int i,flag;

    void inputNumber()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        value = obj.nextInt();
    }
    void displayPr()
    {
        for(num=2;num<=value;num++)
        {
            flag=0;
            for(i=2;num<=num-1;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(num);
            }
           
                
            
        }
    }
}
class prime
{
    public static void main(String a[])
    {
        Pr p=new Pr();
        p.inputNumber();
        p.displayPr();
    }
}