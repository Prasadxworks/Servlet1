package com.xworkz.spotify.app.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

    private static EntityManagerFactory factory = null;

    public static EntityManagerFactory getEntityManagetFactory() {


        return factory;
    }

    static {
        factory = Persistence.createEntityManagerFactory("test");
    }

}