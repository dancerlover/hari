public class list_add {
    
    class node{
        int data;
        node next,prev;
        node(int d) 
        {
           this.data=d;
           this.next=null;
           this.prev=null;
        }
    }
    node head=null;   
    void add(int d)
    {
        node n=new node(d);
        
         if(head==null)     
        {
           head=n;
           head.prev=null;
           head.next=null;
        }
        else{
           node temp=head;
           while(temp.next!=null)
           {
            temp=temp.next;
            }
            //  System.out.print(temp.data);
             temp.next=n;
             temp.prev=temp;          
        }
    }
    void insert(int t,int a)
    {
        node h=new node(t);
         h.data=t;
         h.next=null;
         h.prev=null;
         node temp=head;
         int l=1;
         while(l<a)
         {
             h.next=temp.next;
             h.prev=temp;
             temp.next=h;
             l++;
         }
         //System.out.println("h:"+temp.data);
        }
        void disp(){
            node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
        } 

        }
    
    public static void main(String[] args) {
        list_add j=new list_add();        
        j.add(12);
        j.add(42);
        j.add(45);
        j.insert(20,2);
        j.disp();
        
        
    }

}
