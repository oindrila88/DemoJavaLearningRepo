package learning.threads;

public class ThreadCallingClass
{
	public static void main(String[] args) throws InterruptedException
	{
		//Create an object of MyThread Class using Object Reference of Thread Class
		MyThread mt = new MyThread();
		
		//Multiply each element of Array "arr" inside MyThread Class using Thread. To do so, Start the Thread. This will implicitly call "run" method
		mt.start();
		mt.printArr();
		
		//Now, if "MyThread" Class needs to inherit some other class also, that is not possible because it has already inherited "Thread" Class. To avoid such situations, it is recommended to implement "Runnable" Interface, which contains "run" method to override. Since Runnable Interface does not have "start" method, calling it will give Compile-Time Error
		MyRunnableThread mrt = new MyRunnableThread();
		//mrt.start();
		
		//Now to run the Thread, "start" method needs to be called. To do so, an Object of Thread Class is created, and, the Object of the Class that implements Runnable Interface is passed to the Constructor of the Thread. Then "start" method is called
		Thread t = new Thread(mrt);
		t.start();
		mrt.printArr();
		
		//Print "Hi" and "Hello" alternatively
		Thread hiThread = new Thread(new Hi().hi);
		hiThread.start();
		
		//When a Thread is created, by default, its name would be "Thread-0". For the second Thread, the name would be "Thread-1", and so on. At the time of Thread creation, desired Thread name can be passed as parameter in the Constructor of Thread - "Thread t = new Thread(RunnableInterfaceObject, "Desired_Thread_Name");"
		//Thread helloThread = new Thread(new Hello().hello, "Hello Thread 1");
		Thread helloThread = new Thread(new Hello().hello);
		helloThread.start();
		
		//The name of any Thread can be set using "setName" method
		helloThread.setName("Hello Thread 1");
		
		//The name of any Thread can be fetched using "getName" method
		System.out.println("Name of the 'helloThread' Thread : " + helloThread.getName());
		
		//When a Thread is created, by default, it is created with default Priority "5", which corresponds to the built-in Thread Constant "NORMAL_PRIORITY". The range of Priority of Thread starts from "1", which corresponds to the built-in Thread Constant "MIN_PRIORITY", and goes to "10", which corresponds to the built-in Thread Constant "MAX_PRIORITY"
		//The Priority of any Thread can be set using "setPriority" method
		helloThread.setPriority(7);
		
		//The Priority of any Thread can be fetched using "getPriority" method
		System.out.println("Priority of the 'helloThread' Thread : " + helloThread.getPriority());
		
		//Print "Bye" after printing "Hi" and "Hello" alternatively
		//System.out.println("Bye");
		//But "Bye" gets printed after "Hi" prints only once. "hiThread" Thread is busy printing "Hi", and, "helloThread" Thread is busy printing "Hello". Now, default "Main" Thread is free. So, after printing "Hi" for the first time, "hiThread" Thread goes for a pause. Then before "helloThread" Thread could start executing and prints "Hello", default "Main" Thread executes "Bye". Now, to achieve the goal, we must tell "Main" Thread to wait for "hiThread" Thread, and, "helloThread" Thread to finish respective jobs. This can be done using "join" method
		
		System.out.println("Before 'Join' method is run, the thread 'hiThread' is Alive : " + hiThread.isAlive());
		//Once the job of the Thread is done, it is dead. "isAlive" method checks if a Thread is in running state
		//Checking the state of "hiThread" Thread, before "join" method would return True
		//Checking the state of "hiThread" Thread, after "join" method would return False
		hiThread.join();
		helloThread.join();
		System.out.println("Bye");
		
		System.out.println("After 'Join' method is run, the thread 'hiThread' is Alive : " + hiThread.isAlive());
	
		//Call "increment()" method using two threads. "incrementThread1" Thread, and, "incrementThread2" Thread should call the method "increment()" alternatively. The expected value of "count" should be "2000"
		//Both the Thread should not operate on the method "increment()" at the same time. If so happens, unexpected result will be displayed. To achieve this, the method "increment()" should be "Synchronized", so that at a time, only one Thread can operate on it
		MySynchronized ms = new MySynchronized();
		
		Thread incrementThread1 = new Thread(ms.incrementRunnable1);
		incrementThread1.start();
		
		Thread incrementThread2 = new Thread(ms.incrementRunnable2);
		incrementThread2.start();
		
		incrementThread1.join();
		incrementThread2.join();
		
		ms.getCountValue();
		
		//Call "setNumber()", and, "getNumber()" methods using two threads alternatively. "setNumberThread" Thread should call the method "setNumber()", and, only after that the "getNumberThread" Thread should call the method "getNumber()"
		//In each iteration, "setNumberThread" Thread will call the method "setNumber()", only if the value is not set. Once the value is set, "getNumberThread" Thread will call the method "getNumber()" for that iteration, and, "setNumberThread" Thread will again call the method "setNumber()" for the next iteration. So now the value is not set for the next iteration. So, there should be a boolean value to check if the value has been set for each iteration. At the beginning of each iteration, the boolean value should be false. So, "getNumberThread" Thread will have to wait to call the method "getNumber()".
		//In every iteration, "setNumberThread" Thread calls the method "setNumber()" if the boolean value is false, and, will set the boolean value to true. In the mean time, "getNumberThread" Thread will wait for "setNumberThread" Thread to finish its work. Once "setNumberThread" Thread notifies that its work is finished, "getNumberThread" Thread calls the method "getNumber()" , and, will set the boolean value to false for the nest iteration. In the mean time, "setNumberThread" Thread will wait for "getNumberThread" Thread to finish its work. Once "getNumberThread" Thread notifies that its work is finished, "setNumberThread" Thread prepares to call the method "setNumber()"
		MyNumber mn = new MyNumber();
		
		Thread setNumberThread = new Thread(mn.setNumberRunnable);
		setNumberThread.start();
		
		Thread getNumberThread = new Thread(mn.getNumberRunnable);
		getNumberThread.start();
		
		setNumberThread.join();
		getNumberThread.join();
	}
}