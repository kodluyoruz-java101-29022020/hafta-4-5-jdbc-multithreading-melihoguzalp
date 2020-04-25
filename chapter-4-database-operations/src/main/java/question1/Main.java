package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Main {
	

    static List<Integer> list;
    static List<Integer> oddList = new ArrayList<>();
    static List<Integer> evenList = new ArrayList<>();

	public static void main(String[] args) {
		

		
		  list = new ArrayList<Integer>();

	        for (int i = 0; i <= 10000; i++) {

	            list.add(i);

	        }
	        


	        List<Integer> sub1 = list.subList(1, 2500);
	        List<Integer> sub2 = list.subList(2500, 5000);
	        List<Integer> sub3 = list.subList(5000, 7500);
	        List<Integer> sub4 = list.subList(7500, 10000);

	        
	       

	        OnNumberListener onListener = new OnNumberListener() {

	            @Override
	            public synchronized void onNumberGet(TYPE type, int number) {

	                if (type == TYPE.EVEN) {
	                    evenList.add(Integer.valueOf(number));
	                } else if (type == TYPE.ODD) {
	                    oddList.add(Integer.valueOf(number));
	                }
	                 System.out.println("Type: "+type.name()+" number: "+number+" oddSize: "+oddList.size()+" evenSize: " + evenList.size());

	            }
	        };

	        ThreadOperations th = new ThreadOperations(sub1, onListener);
	        ThreadOperations th1 = new ThreadOperations(sub2, onListener);
	        ThreadOperations th2 = new ThreadOperations(sub3, onListener);
	        ThreadOperations th3 = new ThreadOperations(sub4, onListener);

	        
	        Thread thread1 = new Thread(th);
	        Thread thread2 = new Thread(th1);
	        Thread thread3= new Thread(th2);
	        Thread thread4 = new Thread(th3);
	        
	        thread1.start();
	        thread2.start();
	        thread3.start();
	        thread4.start();
	        
	        

		
	}
	
	
	
	public static void printEvenOrOddNumbers(List<Integer> printList) {
		
		for(int i = 0; i< printList.size() ; i++ ) {
			
			System.out.println(printList.get(i)); 
			
			
		}
		
		
	}

	
}
