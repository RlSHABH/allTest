package designPattern;

import java.io.Serializable;

public class SingletonCLass implements Serializable ,Cloneable {

    private static SingletonCLass singletonCLassInstance;

    private final int id;

    private final String name;

    private SingletonCLass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SingletonCLass getSingletonCLassInstance() {
        if (singletonCLassInstance != null) {
            return singletonCLassInstance;
        }

        synchronized (SingletonCLass.class) {
            if (singletonCLassInstance != null) {
                return singletonCLassInstance;
            }
            singletonCLassInstance = new SingletonCLass(1, "rishabh");
            return singletonCLassInstance;
        }
    }


    protected Object readResolve() {
        return getSingletonCLassInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       return getSingletonCLassInstance();
    }


}

 enum SingletonEnum implements Serializable{
     INSTANCE("rishabh");

     private  String name;

     SingletonEnum(String name)
     {

         this.name = name;
     }


}