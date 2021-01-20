package operation;

import book.BookList;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:41
 */
public class ExitOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
