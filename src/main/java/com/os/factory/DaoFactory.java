package com.os.factory;

import com.os.enums.DataBaseSelector;
import com.os.exception.DataBaseConnectionException;
import com.os.exception.DataBaseNotSupportedException;
import com.os.exception.IncorrectPropertyException;
import com.os.persistance.dbConnection.MySQLDaoFactory;
import com.os.persistance.impl.DaoFactoryImpl;
import com.os.persistance.interfaces.*;
import com.os.persistance.poolConnection.ConnectionPoolHolder;
import org.apache.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class DaoFactory {
    private static final Logger LOGGER = Logger.getLogger(DaoFactory.class);
    private DataSource dataSource = ConnectionPoolHolder.getDataSource();

    private static DaoFactory daoFactory;

    public abstract BookDao createBookDao();

    public abstract AuthorDao createAuthorDao();

    public abstract BookAttributeDao createBookAttributeDao();

    public abstract ReaderDao createReaderDao();

    public abstract OrderDao createOrderDao();

    public abstract AdministratorDao createAdministratorDao();

    public abstract LanguageDao createLanguageDao();

    public static DaoFactory getDaoFactory(DataBaseSelector dataBase) throws
            DataBaseNotSupportedException,
            IncorrectPropertyException,
            DataBaseConnectionException {
        switch (dataBase) {
            case MY_SQL:
                return new MySQLDaoFactory();
            case MS_SQL:
                LOGGER.error("Database " + dataBase + " not supported yet");
                throw new DataBaseNotSupportedException(dataBase);
            case ORACLE:
                LOGGER.error("Database " + dataBase + " not supported yet");
                throw new DataBaseNotSupportedException(dataBase);
            case POSTGRES:
                LOGGER.error("Database " + dataBase + " not supported yet");
                throw new DataBaseNotSupportedException(dataBase);
            default:
                LOGGER.error("Database type not set");
                throw new DataBaseNotSupportedException("Database type not set");
        }
    }
    protected Connection getConnection(){
        try{
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            synchronized (DaoFactory.class){
                if(daoFactory == null){
                    daoFactory = new DaoFactoryImpl();
                }
            }
        }
        return daoFactory;
    }



}
