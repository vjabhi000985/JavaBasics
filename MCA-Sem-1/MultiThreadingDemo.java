class MultiThread extends Thread{
	public void run(){
		try{
			System.out.println("Thread "+ Thread.currentThread().getId() + " is running.");
		}
		catch(Exception e){
			System.out.println("Exception is caught.");
		}
	}
}

public class MultiThreadingDemo{
	public static void main(String[] args){
		int n = 15;
		for(int i=0;i<=n;i++){
			MultiThread threads = new MultiThread();
			threads.start();
		}
	}
}