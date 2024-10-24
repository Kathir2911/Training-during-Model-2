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
class stack
{
    node head,tail,newNode,temp;
    boolean isEmpty()
    {
        return(head==null);
    }
    void push(char num)
    {
        newNode=new node(num);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
            return;
        }
        head=head.next;
    }
    int peak()
    {
        if(isEmpty())
        {
            return '\0';
        }
        return head.data;
    }
}
public class ParanthesisChecker {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        stack sm=new stack();
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'||str.charAt(i)=='<')
            {
                sm.push(str.charAt(i));
            }
            else if((str.charAt(i)==')'&& sm.peak()=='(')||(str.charAt(i)==']'&& sm.peak()=='[')||(str.charAt(i)=='}'&& sm.peak()=='{')||(str.charAt(i)=='>'&& sm.peak()=='<'))
            {
                sm.pop();
            }
            else
                sm.push(str.charAt(i));
            
        }
        if(sm.isEmpty())
        {
            System.out.print("Yes");
        }
        else{
                System.out.print("No");
        }
    }
}
