/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-31
 * @time: 18:29
 */
public class SeqList {

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        //MyArrayList myArrayList1=new MyArrayList(20);
        myArrayList.add(0,9);
        myArrayList.add(1,8);
        myArrayList.add(2,7);
        myArrayList.add(3,6);
        myArrayList.display();
        myArrayList.add2(5);
        myArrayList.add2(4);
        myArrayList.display();
        //System.out.println(myArrayList.contains(4));
        //System.out.println(myArrayList.search(4));
        System.out.println(myArrayList.getPos(6));
        //System.out.println(myArrayList.size());
    }
}
