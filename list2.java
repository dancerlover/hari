public class list2 {
    class node{
        int data;
        node next;
        node(int d)
        {
           this.data=d;
           this.next=null;
        }
    }
    node head=null;
        void insert(int n)
        {
         node in=new node(n);
         if(head==null){
            head=in;
         }else{
            node temp=head;
                while(temp.next!=null)
                temp=temp.next;
                temp.next=in;
        }
        }
        void ran(int t,int r)
        {
            node n=new node(r);
            n.data=t;
            n.next=null;
            int l=1;
            node temp=head;
            while(l<r)
            {
               n.next=temp.next;
               temp.next=n;
                l++;
            }
        }    
        void push(int a)
        {
            node g=new node(a);
            g.next=head;
            head=g;
        }
        void del(int b)
        {
            node temp=head;
            while(temp.data!=b)
            {
            temp=temp.next;
            temp.next=temp.next.next;
            }
        }
        void delete(int y)
        {
            node temp=head,prev=null;
            while(temp.data!=y)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;

        }
        void disp()
        {
            node temp=head;
            while(temp!=null)
            {   
              System.out.println(temp.data);
              temp=temp.next;
            }  
        }
    public static void main(String[] args) {
        list2 obj=new list2();
        obj.insert(10);
        obj.insert(11);
        obj.insert(89);
        obj.ran(13,2);
        obj.push(20);
        obj.del(10);//delafter
        obj.delete(89);//del the exact element
        obj.disp();  
    }
}
