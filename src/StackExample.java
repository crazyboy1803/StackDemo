import java.util.Scanner;
public class StackExample 
{
    int ar[];
    int top;
    StackExample()
    {
        ar=new int[5];
        top=-1;
    }
    void push()//insert
    {
        if(top==4)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            top = top +1 ;
            ar[top] = data;
            System.out.println("Data inserted....");
        }
//        System.out.println("push function is working");
    }
    void pop()//delete
    {
        if(top == -1)
        {
            System.out.println("Stack is already empty");
        }
        else
        {
            System.out.println("Element deleted ="+ar[top]);
            top = top-1;
        }
//        System.out.println("pop function is working");
    }
    void traverse()//view
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
        }
//        System.out.println("view function is working");
    }
    public static void main(String arg[])
    {
        StackExample obj = new StackExample();
        while(true)
        {
            System.out.println("press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit\n");
            
            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
