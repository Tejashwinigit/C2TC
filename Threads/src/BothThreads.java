
public class BothThreads extends Thread {
	String task;
	BothThreads(String task)
	{
		this.task=task;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(task +":"+i);
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
				
				
			}
			while(i<5) {
				System.out.println(i);
				i++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		BothThreads th1=new BothThreads("which school");
		BothThreads th2=new BothThreads("which class");
		
		Thread t1= new Thread(th1);
		Thread t2= new Thread(th2);
		
		t1.start();
		t2.start();
				
		
	}

}
