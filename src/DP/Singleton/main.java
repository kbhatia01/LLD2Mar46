package DP.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {

    public static void main(){

        DBconn d1 = DBconn.createInstance();
        DBconn d2 = DBconn.createInstance();

        System.out.println(d1);
        System.out.println(d2);

//        Create thread and in that thread call dbConn;

    }
}
