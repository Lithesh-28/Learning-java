package ThreadsLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public synchronized void Withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw!!" + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance > amount) {
                    try{

                        System.out.println(Thread.currentThread().getName() + "Processing Withdrawal");
                        Thread.sleep(3000);

                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Withdrawal complete");
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() +"Insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + "Could not acquire the lock, will try later");
            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println("any message when the thread is interrupted");
        }
    }
}





