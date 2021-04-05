class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}
class MyHashSet {
    public Node[] elem;
    int len=1000;
    public MyHashSet() {
        this.elem=new Node[len];
    }
    public void add(int key) {
        int index=key%len;
        if(elem[index]==null){
            elem[index]=new Node(key);
            return;
        }
        Node cur=elem[index];
        while(cur.next!=null){
            if(cur.val==key){
                return;
            }
            cur=cur.next;
        }
        if(cur.val==key){
            return;
        }
        cur.next=new Node(key);

    }
    
    public void remove(int key) {
        int index=key%len;
        Node cur=elem[index];
        Node prev=null;
        while(cur!=null){
            if(cur.val==key){
                if(prev==null){
                    elem[index]=elem[index].next;
                }else{
                    prev.next=cur.next;
                }
                return;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index=key%len;
        Node cur=elem[index];
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
}