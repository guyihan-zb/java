class Node{
    public int key;
    public int val;
    public Node next;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}

class MyHashMap {
    public Node[] elem;
    int len=1000;
    public MyHashMap() {
        this.elem=new Node[len];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        Node node= new Node(key,value);
        int index=key%len;
        Node cur=elem[index];
        if(cur==null){
            cur=node;
        }else{
            while(cur!=null){
                if(cur.key==key){
                    cur.val=value;
                    return;
                }
                cur=cur.next;
            }
        }
        node.next=elem[index];
        elem[index]=node;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index=key%len;
        Node cur=elem[index];
        while(cur!=null){
            if(cur.key==key){
                return cur.val;
            }
            cur=cur.next;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index=key%len;
        Node cur=elem[index];
        Node prev=null;
        while(cur!=null){
            if(cur.key==key){
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
}