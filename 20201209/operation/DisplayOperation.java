package operation;

import book.Book;
import book.BookList;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:41
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
