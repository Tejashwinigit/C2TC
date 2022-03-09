class thread1 extends Thread{
	
	
	public void run() {
		    int counter=0;
		    
		    	
			while(counter<5000)	{
				
				System.out.println("Thread  (1) \t"+counter);
				
				counter++;
				if(counter==5000) {
					counter=0;
				}
				
			}		
		    
	}
	
}














public class B2 implements Runnable {
	public void run() {
		int counter=0;
	    
    	
		while(counter<5000)	{
			
			System.out.println("Thread    (2) \t"+counter);
			
			counter++;
			if(counter==5000) {
				counter=0;
			}
			
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 r = new thread1();
		r.start();                          //thread1
		
		                        //thread3
		
		B2 u = new B2();
		Thread K = new Thread(u);
		K.start();                          //thread2
		

	}

}