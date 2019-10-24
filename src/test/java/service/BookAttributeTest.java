package service;

import com.os.factory.DaoFactory;
import com.os.persistance.impl.DaoFactoryImpl;
import com.os.persistance.interfaces.BookAttributeDao;
import com.os.persistance.interfaces.BookDao;
import org.junit.Test;

public class BookAttributeTest {
    private DaoFactory daoFactory = new DaoFactoryImpl();
    private BookAttributeDao bookAttributeDao = daoFactory.createBookAttributeDao();

    @Test
    public void getAllByBookId(){
        int id = 2;
        System.out.println(bookAttributeDao.getAttributesByBookId(id));
    }

    @Test
    public void getAttributesByBookDao(){
        int id = 36;
        DaoFactory daoFactory = DaoFactory.getInstance();
        try(BookDao bookDao = daoFactory.createBookDao()){
            System.out.println(bookDao.getBookAttributesByBookId(id));
        }
    }
}
