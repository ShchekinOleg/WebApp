package com.os.service.impl;

import com.os.entity.Administrator;
import com.os.factory.DaoFactory;
import com.os.persistance.interfaces.AdministratorDao;

public class AdministratorServiceImpl {
        private DaoFactory daoFactory = DaoFactory.getInstance();

        public Administrator getAdministratorByLoginAndPassword(String login, String password){
            Administrator administrator;
            try (AdministratorDao administratorDao = daoFactory.createAdministratorDao()){
                administrator = administratorDao.getByLoginAndPassword(login, password);
            }
            return administrator;
        }

        public boolean isExist(String login, String password){
            boolean exist;
            try(AdministratorDao administratorDao = daoFactory.createAdministratorDao()){
                exist = administratorDao.isExist(login, password);
            }
            return exist;
        }
    }
