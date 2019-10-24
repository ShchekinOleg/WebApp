package service;

import com.os.entity.Book;
import com.os.entity.Language;
import com.os.factory.DaoFactory;
import com.os.persistance.impl.DaoFactoryImpl;
import com.os.persistance.interfaces.BookDao;
import com.os.persistance.interfaces.LanguageDao;
import com.os.service.impl.BookServiceImpl;
import org.junit.Test;

import java.util.List;

public class BookTest {
    private DaoFactory daoFactory = new DaoFactoryImpl();
    private BookDao bookDao = daoFactory.createBookDao();
    private BookServiceImpl bookService = new BookServiceImpl();

    @Test
    public void getAllAvail(){
        List<Book> books1 = bookService.getAllAvailableBooks();
        System.out.println(books1);
    }

    @Test
    public void getById(){
        int id = 36;
        System.out.println(bookDao.getById(id));
    }

    @Test
    public void getBooksSearchByParam(){
        String param = "java";
        System.out.println(bookDao.searchByParam(param));
    }

    @Test
    public void getLanguage(){
        String name = "en";
        LanguageDao languageDao = daoFactory.createLanguageDao();
        Language language = languageDao.getLanguageByLanguageName(name);
        System.out.println(bookDao.getAllAvailableByLanguage(language));
    }
}
