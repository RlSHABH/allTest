package designPattern;

import designPattern.SingletonCLass;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args)  {
	Runnable r=() ->{
	    try {
            SingletonCLass singletonCLass = SingletonCLass.getSingletonCLassInstance();
            System.out.println(singletonCLass);

            // Serializable
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("object.txt"));
            o.writeObject(singletonCLass);
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("object.txt"));
            SingletonCLass singletonCLass1=(SingletonCLass) objectInputStream.readObject();
            System.out.println(singletonCLass1);

            // cloning
            System.out.println(singletonCLass.clone());

            // Reflection
            Constructor[] constructor=SingletonCLass.class.getDeclaredConstructors();
            constructor[0].setAccessible(true);
            SingletonCLass singletonCLass2=(SingletonCLass) constructor[0].newInstance(2,"rishabh");
            System.out.println(singletonCLass2);

            // Singleton ENum

            SingletonEnum singleton = SingletonEnum.INSTANCE;
            System.out.println(singleton);



        }
	    catch (Exception e) {
        }
	};

	Thread t=new Thread(r);
	t.start();


    }
}

