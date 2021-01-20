package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:41
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书名");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                book.setStatus(false);
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要归还的这本书！");
    }
}
