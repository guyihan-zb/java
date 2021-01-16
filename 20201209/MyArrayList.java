import java.util.Arrays;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2020-12-31
 * @time: 18:35
 */
public class MyArrayList{
    private int[] elem;//null
    private int usedSize;
    public MyArrayList() {
        this.elem = new int[5];
    }
    public MyArrayList(int capacity) {
        this.elem = new int[capacity];
    }
    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }
    public void resize(){
        this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()){
            System.out.println("顺序表为满");
            resize();
            return;
        }
        if (pos<0||pos>this.usedSize){
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    public void add2(int data){
        if(isFull()){
            System.out.println("顺序表为满");
            resize();
            //return;
        }
        this.elem[this.usedSize]=data;
        this.usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <usedSize ; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <usedSize ; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos<0||pos>=this.usedSize){
            return -1;
        }
        for (int i = 0; i <this.usedSize ; i++) {
            return this.elem[pos];
        }
        return -1;
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos<0||pos>=usedSize){
            return ;
        }
        this.elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int key) {
       int index=search(key);
       if(index==-1){
           System.out.println("没有啊");
           return;
       }
        for (int i = index; i <usedSize-1 ; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }

}
