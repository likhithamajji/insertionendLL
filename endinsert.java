class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
    }
}
class LLE{
    public static node head;
    public static void addend(int num){
        node newnode=new node(num);
        node temp=head;
        if(head==null){
            head=newnode;
            return;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public static void display(){
        node temp =head;
        if(head==null){
            System.out.print("no linkedlist");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
class endinsert{
    public static void main(String[] args) {
        
    
    LLE.addend(1);
    LLE.addend(2);
    LLE.addend(3);
    LLE.addend(4);
    LLE.addend(5);
    LLE.addend(6);
    LLE.display();
}
}

