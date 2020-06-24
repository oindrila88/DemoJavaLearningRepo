package learning.threads;

public class ThreadCallingClass
{
	public static void main(String[] args) throws InterruptedException
	{
		//Threads can be created by using two mechanisms :
		//1. Extending the Thread Class
		//The first and easiest way to create a Thread is to create a new Class that extends the "Thread" Class, then, override the "run()" method, and, then create an Instance of that Class
		//The "start()" method internally calls the "run()" method to execute the code specified in the "run()" in a separate Thread, when the "start()" method is called by an Instance of the Class that extends the "Thread" Class
		//The "start()" method of the "Thread" Class is used to begin the execution of the Thread. The result of this method is two Threads that would run concurrently -
		//A. The "Main" Thread
		//B. The new Thread, which will execute the overridden "run()" method
		MyThread mt = new MyThread();
		
		//Multiply each element of Array "arr" inside MyThread Class using Thread. To do so, Start the Thread. This will implicitly call "run" method
		mt.start();
		mt.printArr();
		
		//Now, if "MyThread" Class needs to inherit some other class also, that is not possible because it has already inherited "Thread" Class. To avoid such situations, it is recommended to implement "Runnable" Interface, which contains "run" method to override
		//2. Implementing the Runnable Interface
		//The second way is to create a Class ("Concrete", or, "Anonymous") that implements the "Runnable" Interface, in which the "run()" method would be implemented. To execute the "run()" method by a Thread, an Instance of the Class that implements the "Runnable" Interface is passed to the "Constructors" of the "Thread" Class
		MyRunnableThread mrt = new MyRunnableThread();
		
		//Since Runnable Interface does not have "start" method, calling it will give Compile-Time Error
		//mrt.start();
		
		//Now to run the Thread, "start()" method needs to be called. To do so, an Object of Thread Class is created, and, the Object of the Class that implements "Runnable" Interface is passed to the Constructor of the "Thread" Class. Then "start()" method is called
		Thread t = new Thread(mrt);
		t.start();
		mrt.printArr();
		
		//MultiThreading
		//Print "Hi" and "Hello" alternatively
		Thread hiThread = new Thread(new Hi().hi);
		hiThread.start();
		
		//Thread Name - When a Thread is created, by default, its name would be "Thread-0". For the second Thread, the name would be "Thread-1", and so on. At the time of Thread creation, desired Thread name can be passed as parameter in the Constructor of Thread - "Thread t = new Thread(RunnableInterfaceObject, "Desired_Thread_Name");"
		//Thread helloThread = new Thread(new Hello().hello, "Hello Thread 1");
		Thread helloThread = new Thread(new Hello().hello);
		helloThread.start();
		
		//setName - The name of any Thread can be set using "setName" method at any point of time in a code
		helloThread.setName("Hello Thread 1");
		
		//getName - The name of any Thread can be fetched using "getName" method at any point of time in a code
		System.out.println("Name of the 'helloThread' Thread : " + helloThread.getName());
		
		//Thread Priority - When a Thread is created, by default, it is created with default Priority "5", which corresponds to the built-in Thread Constant "NORMAL_PRIORITY". The range of Priority of Thread starts from "1", which corresponds to the built-in Thread Constant "MIN_PRIORITY", and goes to "10", which corresponds to the built-in Thread Constant "MAX_PRIORITY"
		//setPriority -The Priority of any Thread can be set using "setPriority" method at any point of time in a code
		helloThread.setPriority(7);
		
		//getPriority - The Priority of any Thread can be fetched using "getPriority" method at any point of time in a code
		System.out.println("Priority of the 'helloThread' Thread : " + helloThread.getPriority());
		
		//Print "Bye" after printing "Hi" and "Hello" alternatively
		//System.out.println("Bye");
		//But "Bye" gets printed after "Hi" prints only once. "hiThread" Thread is busy printing "Hi", and, "helloThread" Thread is busy printing "Hello". Now, default "Main" Thread is free. So, after printing "Hi" for the first time, "hiThread" Thread goes for a pause. Then before "helloThread" Thread could start executing and prints "Hello", default "Main" Thread executes "Bye". Now, to achieve the goal, we must tell "Main" Thread to wait for "hiThread" Thread, and, "helloThread" Thread to finish respective jobs. This can be done using "join" method
		
		System.out.println("Before 'Join' method is run, the thread 'hiThread' is Alive : " + hiThread.isAlive());
		//Once the job of the Thread is done, it is dead. "isAlive" method checks if a Thread is in running state
		//Checking the state of "hiThread" Thread, before "join" method would return True
		//Checking the state of "hiThread" Thread, after "join" method would return False
		//Thread.join() - The "join()" method will put the current Thread, i.e., "Main" Thread, or, any other Thread on wait, until the Thread on which it is called is dead, i.e., completes its execution. If the Thread is "interrupted", then it will throw InterruptedException. Once the Thread is completed, the execution of the Program returns to the previous Thread, i.e., "Main" Thread, or, any other Thread
		hiThread.join();
		helloThread.join();
		System.out.println("Bye");
		
		System.out.println("After 'Join' method is run, the thread 'hiThread' is Alive : " + hiThread.isAlive());
	
		//Synchronization - MultiThreaded programs may regularly come up with a situation where multiple Threads attempt to get to the same resources, which produces erroneous and unforeseen results. This can be solved by using "Synchronization". In "Synchronization", a single specific Thread can get to a particular resource at a given purpose of time. All the other Threads, attempting to get to that particular resource are blocked, until the permissible Thread is finished working with the resource
		//Locks - "Synchronization" is built around an internal entity, known as "Lock", or, "Monitor". Each and every Object has a "Lock" associated with it. So, a Thread that needs consistent access to an Object's "Variable", "Method", or, "Block", needs to acquire that particular Object's "Lock" before accessing the corresponding "Variable", "Method", or, "Block", and, then release the "Lock" when the work is done
		//Call "increment()" method using two threads. "incrementThread1" Thread, and, "incrementThread2" Thread should call the method "increment()" alternatively. The expected value of "count" should be "2000"
		//Both the Thread should not operate on the method "increment()" at the same time. If so happens, unexpected result will be displayed. To achieve this, the method "increment()" should be "Synchronized", so that at a time, only one Thread can operate on it
		MySynchronized ms = new MySynchronized();
		MySynchronizedImplemented msi = new MySynchronizedImplemented(ms);
		
		Thread incrementCountThread1 = new Thread(msi.incrementCountRunnable1);
		incrementCountThread1.start();
		
		Thread incrementCountThread2 = new Thread(msi.incrementCountRunnable2);
		incrementCountThread2.start();
		
		incrementCountThread1.join();
		incrementCountThread2.join();
		
		ms.getCountValue();
		
		Thread incrementSizeThread1 = new Thread(msi.incrementSizeRunnable1);
		incrementSizeThread1.start();
		
		Thread incrementSizeThread2 = new Thread(msi.incrementSizeRunnable2);
		incrementSizeThread2.start();
		
		incrementSizeThread1.join();
		incrementSizeThread2.join();
		
		MySynchronized.getSizeValue();
		
		//InterThread Communication
		//Polling and its Problems - The process of testing a condition repeatedly till it becomes "True", is known as "Polling". "Polling" is usually implemented with the help of Loops to check whether a particular condition is "True", or, not. If it is "True", certain action is taken. "Polling" wastes many CPU Cycles, and, makes the implementation inefficient
		//Solution of the Problem Caused by "Polling" - To avoid "Polling", three "final" methods of "Object" Class must be used within a "synchronized" "Block", or, "Method" only -
		//1. wait() - This method tells the "Calling Thread" to give up "Lock" of the particular resource, and, go to sleep until some other Thread enters that particular resource and calls "notify()" method
		//2. notify() - This method asks to wake up a single Thread, that called "wait()" method on the particular resource. It should be noted that, calling "notify()" does not actually give up a lock on a resource
		//3. notifyAll() - This method asks to wake up all the Threads, that called "wait()" method on the particular resource
		
		//Call "setNumber()", and, "getNumber()" methods using two threads alternatively. "setNumberThread" Thread should call the method "setNumber()", and, only after that the "getNumberThread" Thread should call the method "getNumber()"
		//Process -
		//Step 1. In each iteration, at first, "setNumberThread" Thread will call the method "setNumber()", only if "isLocked" is "False", and meanwhile, "getNumberThread" Thread will wait for the value of "isLocked" to be "True"
		//Step 2. After the "setNumberThread" Thread is finished working with the method "setNumber()", "setNumberThread" Thread changes the value of "isLocked" to "True"
		//Step 3. Once the value of "isLocked" becomes "True", "getNumberThread" Thread will call the method "getNumber()" for that iteration, and, meanwhile, "setNumberThread" Thread will wait for the value of "isLocked" to be "False" to call the method "setNumber()" for the next iteration
		//Step 4. When "getNumberThread" Thread is finished working with the method "getNumber()", the "getNumberThread" Thread changes the value of "isLocked" to "False"
		//Step 5. In the next iteration, the cycle continues from "Step 1" again
		MyNumber mn = new MyNumber();
		
		Thread setNumberThread = new Thread(mn.setNumberRunnable);
		setNumberThread.start();
		
		Thread getNumberThread = new Thread(mn.getNumberRunnable);
		getNumberThread.start();
		
		setNumberThread.join();
		getNumberThread.join();
	}
}