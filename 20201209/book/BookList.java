package book;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:22
 */
public class BookList {
    private Book[] books;
    private int usedSize;

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public BookList() {
        this.books = new Book[10];
        books[0]=new Book("三国演义","罗贯中",72,"小说");
        books[1]=new Book("西游记","吴承恩",32,"小说");
        books[2]=new Book("水浒传","施耐庵",52,"小说");
        this.usedSize=3;

    }
    //尾插法
    public void setBooks(int pos,Book book){
        this.books[pos]=book;
    }

    public Book getBook(int pos){
        return this.books[pos];
    }
}
