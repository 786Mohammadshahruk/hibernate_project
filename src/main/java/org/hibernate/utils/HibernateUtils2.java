/*
package org.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import java.util.HashMap;
import java.util.Map;

public class HibernateUtils2 {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    static {
        try {
            StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
            Map<String, String> dbSettingDetails = new HashMap<>();
            dbSettingDetails.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            dbSettingDetails.put(Environment.URL, "jdbc:mysql://localhost:3306/employee");
            dbSettingDetails.put(Environment.USER, "root");
            dbSettingDetails.put(Environment.PASS, "root12345");
            dbSettingDetails.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            standardServiceRegistryBuilder.applySettings(dbSettingDetails);
            registry = standardServiceRegistryBuilder.build();

            MetadataSources metadataSources = new MetadataSources(registry);
            Metadata metadata = metadataSources.getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        } catch (Exception exception) {
            exception.printStackTrace();
            if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
                System.out.println("Destroying StandardServiceRegistry");
            }
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
*/
