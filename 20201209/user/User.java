package user;

import book.BookList;
import operation.IOperation;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-01-19
 * @time: 22:22
 */
public abstract class User {
    public String name;
    public IOperation[] operations;


    public User(String name){
        this.name=name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        this.operations[choice].work(bookList);
    }
}
