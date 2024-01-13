/* Implementing  a Doubly Linked List in Java*/
import java.util.*;
class Node
{
   int data;
   Node llink;
   Node rlink;
   public Node(int data)
   {
      this.data=data;
      llink=null;
      rlink=null;
   }
}
class Dll
{
    Node head;
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
           head=newNode;
        }
        else
        {
             Node temp=head;
             while(temp.rlink!=null)
             {
                temp=temp.rlink;
             }
             temp.rlink=newNode;
             newNode.llink=temp;
             newNode.rlink=null;
        }
    }

    void delete(int key)
    {
       Node current=head;
       while(current!=null && current.data!=key)
       {
          current=current.rlink;
       }
       if(current==null)
       {
           System.out.println("Not found");
       }
       if(current.llink!=null)
       {
           current.llink.rlink=current.rlink;
           //current.rlink.llink=current.llink;
       }
       else
       {
           head=current.rlink;
       }
       if(current.rlink!=null)
       {
          current.rlink.llink=current.llink;
       }
       else
       {
           current.llink.rlink=null;
       }
    }

    void display()
    {
       Node temp=head;
       while(temp!=null)
       {
          System.out.println(temp.data);
          temp=temp.rlink;
       }
    }
}


class Main
{
   public static void main(String[] args)
   {
       Dll L1=new Dll();
       Scanner sc=new Scanner(System.in);
       int choice;
       do
       {
           System.out.println("1.Insert  2.Delete 3.Display ");
           choice=sc.nextInt();
           switch(choice)
           {
               case 1:
                       System.out.print("Item:");
                       int data=sc.nextInt();
                       L1.insert(data);
		       break;
               case 2:
                        System.out.print("Data:");
                        int deldata=sc.nextInt();
                        L1.delete(deldata);
                        break;
               case 3:

                         L1.display();
                         break;
               case 4:
                         break;
           }
       }
       while(choice!=4);
       sc.close();
   }
}













