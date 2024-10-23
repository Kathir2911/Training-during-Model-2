import java.util.*;
class node
{
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
    node head,tail,newNode,temp,front,back;
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
    void display()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insertbypos(int num,int pos)
    {
        temp=head;
        for(int i=0;i<pos-2;i++)
        {
            temp=temp.next;
        }
        front=temp;
        back=temp.next;
        newNode=new node(num);
        front.next=newNode;
        newNode.next=back;
    }
    void insertionbystart(int num)
    {
        newNode=new node(num);
        newNode.next=head;
        head=newNode;
    }
    void insertionbyend(int num)
    {
        newNode=new node(num);
        tail.next=newNode;
        newNode=tail;
    }
}
public class singlyinsertion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n,num=0,pos=0,num1=0,num2=0,num3=0;
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num=sc.nextInt();
            ll.createNode(num);
        }
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println("Enter the number and postion to insert: ");
        num1=sc.nextInt();
        pos=sc.nextInt();
        ll.insertbypos(num1, pos);
        ll.display();
        System.out.println();
        System.out.print("Enter the number to insert in the start: ");
        num2=sc.nextInt();
        ll.insertionbystart(num2);
        ll.display();
        System.out.println();
        System.out.print("Enter the number to insert at the end: ");
        num3=sc.nextInt();
        ll.insertionbyend(num3);
        ll.display();
        System.out.println();
    }
}
