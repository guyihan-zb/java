package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:40
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查询书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要查找的书名");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println("有这本书！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
