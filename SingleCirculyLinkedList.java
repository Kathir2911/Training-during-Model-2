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
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    void display()
    {
        temp=head;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head)
    }
}
public class SingleCirculyLinkedList {
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
