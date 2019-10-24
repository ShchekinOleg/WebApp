package com.os.factory;

import com.os.service.impl.*;

public class ServiceFactory {

    private static ServiceFactory instance;

    private BookServiceImpl bookServiceImpl;
    private ReaderServiceImpl readerServiceImpl;
    private OrderServiceImpl orderServiceImpl;
    private AdministratorServiceImpl administratorServiceImpl;
    private LanguageServiceImpl languageServiceImpl;
    private AuthorServiceImpl authorServiceImpl;
    private BookAttributeServiceImpl bookAttributeServiceImpl;

    private ServiceFactory() {
        administratorServiceImpl = new AdministratorServiceImpl();
        authorServiceImpl = new AuthorServiceImpl();
        bookAttributeServiceImpl = new BookAttributeServiceImpl();
        bookServiceImpl = new BookServiceImpl();
        languageServiceImpl = new LanguageServiceImpl();
        orderServiceImpl = new OrderServiceImpl();
        readerServiceImpl = new ReaderServiceImpl();
    }

    public static ServiceFactory getInstance() {
        if (instance == null) {
            synchronized (ServiceFactory.class) {
                if (instance == null) {
                    instance = new ServiceFactory();
                }
            }
        }
        return instance;
    }

    AdministratorServiceImpl getAdministratorServiceImpl() {
        return administratorServiceImpl;
    }

    AuthorServiceImpl getAuthorServiceImpl() {
        return authorServiceImpl;
    }

    BookAttributeServiceImpl getBookAttributeServiceImpl() {
        return bookAttributeServiceImpl;
    }

    BookServiceImpl getBookServiceImpl() {
        return bookServiceImpl;
    }

    LanguageServiceImpl getLanguageServiceImpl() {
        return languageServiceImpl;
    }

    OrderServiceImpl getOrderServiceImpl() {
        return orderServiceImpl;
    }

    ReaderServiceImpl getReaderServiceImpl() {
        return readerServiceImpl;
    }
}
