import java.util.*;
class node{
    int data;
    node next;
    node(int num)
    {
        data=num;
        next=null;
    }
}
class LinkedList
{
    node head,tail,temp1,newNode,temp2,temp;
    void createNode(int num)
    {
        newNode=new node(num);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    boolean comparision(LinkedList other)
    {
        temp1=this.head;
        temp2=other.head;
        while(temp1!=null && temp2!=null)
        {
            
            if(temp1.data==temp2.data)
            {    
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else
                return false;
        }
        if(temp1!=null || temp2!=null)
        {
                return false;
        }
        return true;
    }
    void display()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main {
    public static void Comparision(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        System.out.println("Enter the data of first List:");
        System.out.print("Enter the number of elements: ");
        int num1=sc.nextInt();
        int n1,n2;
        for(int i=0;i<num1;i++)
        {
            n1=sc.nextInt();
            list1.createNode(n1);
        }
        System.out.println("Enter the data of second List:");
        System.out.print("Enter the number of elements:");
        int num2=sc.nextInt();
        for(int i=0;i<num2;i++)
        {
            n2=sc.nextInt();
            list2.createNode(n2);
        }
        System.out.println();
        System.out.println("Linked List1: ");
        list1.display();
        System.err.println();
        System.out.println("Linked List2: ");
        list2.display();
        System.out.println();
        System.out.print(list1.comparision(list2));
    }
}
