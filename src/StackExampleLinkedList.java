import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class StackExampleLinkedList 
{
    Node top;
    StackExampleLinkedList()
    {
        top = null;
    }
    void push()//insert
    {
        System.out.println("Enter Data");
        Scanner sc2 = new Scanner(System.in);
        int newitem = sc2.nextInt();
        
        Node newnode = new Node();
        newnode.data = newitem;
        newnode.next = top;
        
        top = newnode;
        System.out.println("data inserted");
    }
    void pop()//delete
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("delete item : "+top.data);
            top = top.next;
        }
    }
    void traverse()//view
    {
        if(top == null)
        {
            System.out.println("Stack Is Empty");
            
        }
        else
        {
            Node current;
            for(current = top;current != null;current = current.next)
            {
                System.out.println(current.data);
            }
        }
    }
    public static void main(String arg[])
    {
        StackExampleLinkedList obj = new StackExampleLinkedList();
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
