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
    void sortedinsert(int num)
    {
        newNode=new node(num);
        temp=head;
        if(temp.data>num)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        while((temp!=null)&&(temp.next!=null)&&(temp.data<temp.next.data)&&(temp.next.data<num))
        {
            temp=temp.next;
        }
        front=temp;
        back=temp.next;
        front.next=newNode;
        newNode.next=back;
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

public class sortedInsertion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n,num=0,num2=0;
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
        System.out.print("Enter the number to insert in the sorted list: ");
        num2=sc.nextInt();
        ll.sortedinsert(num2);
        System.out.println();
        ll.display();
    }
}
