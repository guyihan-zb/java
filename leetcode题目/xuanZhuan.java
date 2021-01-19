import javax.xml.soap.Node;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-11
 * @time: 13:28
 */
public class xuanZhuan {
    private Node head;

    public static int reverse(int x) {
        int res = 0 ;
        while(x != 0){
            int temp = x % 10 + res * 10;
            if((temp - x % 10) / 10 != res){ //最关键的一步
                return 0 ;
            }
            res = temp ;
            x /= 10 ;
        }
        return res ;
    }

    public class Node {
        int val;
        Node next = null;
        Node(int val) {
            this.val = val;
        }
    }
    public boolean chkPalindrome(Node A) {
        if(A==null){
            return false;
        }
        Node fast=A;
        Node slow=A;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node nextMid=slow.next;
        slow.next=null;

        Node pre=null;
        Node next=null;
        while(){

        }

        
        return true;
    }


    public static void main(String[] args) {
        int a=123;
        int ret=reverse(a);
        System.out.println(ret);
    }


}
