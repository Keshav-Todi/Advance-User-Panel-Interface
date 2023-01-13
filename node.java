import java.util.*;
class node
{
    int data;
    node link;
    Scanner sc=new Scanner(System.in);
    public node()
    {
        data=0;
        link=null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        node first=new node();
        int ch,n,k,e,s=1;
        do{
            System.out.println("Enter 1 for Create List");
            System.out.println("Enter 2 for Display List");
            System.out.println("Enter 3 for Insert Begining");
            System.out.println("Enter 4 for Insert End");
            System.out.println("Enter 5 for Insert middle");
            System.out.println("Enter 6 for Delete");
            System.out.println("Enter Your Choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: first.create();
                    break;
                case 2: first.display();
                    break;
                case 3: System.out.println("Enter data for new node");
                        n=sc.nextInt();
                        first.insert_beg(first,n);
                    break;
                case 4: System.out.println("Enter data for new node");
                        n=sc.nextInt();
                        first.insert_end(first,n);
                    break;
                case 5: System.out.println("Enter data for new node");
                        n=sc.nextInt();
                        System.out.println("Enter the node number after new node will be created");
                        k=sc.nextInt();
                        first.insert_middle(first,n,k);
                    break;
                case 6: System.out.println("Enter the node number which you want to delete");
                        n=sc.nextInt();
                        first.delete(first,n);
                    break;
                default:
                    System.out.println("Do you want to continue?> (1/0)");
                    s=sc.nextInt();
            }   
        }while(s!=0);
    }
    public void create()
    {
        int n,i;
        System.out.println("Enter first data:");
        this.data=sc.nextInt();
        System.out.println("Enter number of nodes to be created=");
        n=sc.nextInt();
        node temp,ptr;
        ptr=this;
        for(i=1;i<n;i++)
        {
            temp=new node();
            System.out.println("enter next data:");
            temp.data=sc.nextInt();
            temp.link=null;
            ptr.link=temp;
            temp=null;
            ptr=ptr.link;
        }
    }
    public void display()
    {
        node ptr=this;
        while(ptr!=null)
        {
            System.out.println("Data-->"+ptr.data);
            ptr=ptr.link;
        }
    }
    public void delete(node start,int n)
    {
        node ptr=start;
        node ptr1=ptr;
        int c=1;
        while(c<n)
        {
            ptr1=ptr;
            ptr=ptr.link;
            c++;
        }
        ptr1.link=ptr.link;
        ptr.link=null;
        ptr=ptr1=null;
    }
    public void insert_beg(node start,int x)
    {
        node temp=new node();
        System.out.println("Enter element for the new node:");
        temp.data=x;
        temp.link=null;
        temp.link=start;
        start=temp;
        temp=null;
    }
    public void insert_end(node start,int x)
    {
        node temp=new node();
        System.out.println("Enter element for the new node:");
        temp.data=x;
        temp.link=null;
        node ptr=start;
        while(ptr.link!=null)
            ptr=ptr.link;
        ptr.link=temp;
        temp=ptr=null;
    }
    public void insert_middle(node start,int x,int n)
    {
        node temp=new node();
        System.out.println("Enter element for the new node:");
        temp.data=x;
        temp.link=null;
        node ptr=start;
        int c=1;
        while(c<n)
        {
            ptr=ptr.link;
            c++;
        }
        temp.link=ptr.link;
        ptr.link=temp;
    }
}