import java.util.*;
class node
{
    node pre;
    int data;
    node next;
    node(int num)
    {
        data=num;
        next=null;
        pre=null;
    }
}
class LinkedList
{
    node head,tail,newNode,temp;
    
    void Createnode(int num)
    {
        newNode = new node(num);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.pre=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    void display()
    {
        temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.pre;
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int num;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            num=sc.nextInt();
            ll.Createnode(num);
        }
        ll.display();
    }
}
