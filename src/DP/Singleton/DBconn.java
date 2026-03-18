package DP.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBconn {

    static DBconn instance;
    static Lock l  = new ReentrantLock();

    private DBconn(){

    }

    public static DBconn createInstance(){

        if(instance==null) {
            l.lock();

            if (instance == null) {
                instance = new DBconn();

            }
            l.unlock();
        }
        return instance;
    }
}
