package threadDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Abc implements Runnable
{
	ReentrantLock rl=new ReentrantLock();
	public void run()
	{
		
		try{
			
      if(rl.tryLock(1,TimeUnit.SECONDS))		
		{
		for(int i=0;i<=20;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(500);
			
		}
		rl.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+": Thread Cant wait");
		}
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}
}
public class RunnableDemo {
	public static void main(String args[])
	{
 Abc a1=new Abc();
	Thread t1=new Thread(a1);
	Thread t2=new Thread(a1);
	Thread t3=new Thread(a1);
    t1.start();
	t1.setName("Nassar");
	
	}
}
