package operation;

import book.BookList;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:44
 */
public interface IOperation {
    default void work(BookList bookList) {

    }
}
