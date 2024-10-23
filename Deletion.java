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
    node head,tail,temp,newNode,front,back,middle;
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
    void deletethestart()
    {
        head=head.next;
    }
    void deletetheend()
    {
        temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        temp.next=null;
        temp=tail;
    }
    void deletebypos(int pos)
    {
        temp=head;
        for(int i=0;i<pos-2;i++)
        {
            temp=temp.next;
        }
        front=temp;
        middle=temp.next;
        back=middle.next;
        middle.next=null;
        front.next=back;
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
public class Deletion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n,num,num2;
        System.out.print("Enter the number of elements: ");
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            n=sc.nextInt();
            ll.createNode(n);
        }
        ll.display();
        System.out.println();
        System.out.print("Enter the position to delete: ");
        num2=sc.nextInt();
        ll.deletebypos(num2);
        ll.display();
        System.out.println();
        System.out.println("Delete the element in the start:");
        ll.deletethestart();
        ll.display();
        System.out.println();
        System.out.println("Delete the element at the end:");
        ll.deletetheend();
        ll.display();
    }
}
