package question1;

import java.util.ArrayList;
import java.util.List;


public class ThreadOperations implements Runnable {



	private List<Integer> list;
	private List<Integer> evenList;
	public List<Integer> getEvenList() {
		return evenList;
	}


	public void setEvenList(List<Integer> evenList) {
		this.evenList = evenList;
	}


	public List<Integer> getOddlist() {
		return Oddlist;
	}


	public void setOddlist(List<Integer> oddlist) {
		Oddlist = oddlist;
	}




	private List<Integer> Oddlist;

	private OnNumberListener onListener;
	
	public ThreadOperations(List<Integer> list, OnNumberListener onListener) {

	
		if(list == null) {
			
			list = new ArrayList<Integer>();
		}
		
		this.list = list;
		this.onListener = onListener;
		
	}


	public List<Integer> getList() {
		return list;
	}


	public void setList(List<Integer> list) {
		this.list = list;
	}




	@Override
	public void run() {
		
		
		System.out.println("My summation is started!");	
		
		for(int i = 0 ; i < this.list.size();i++) {
			
			int n = this.list.get(i);
			
			if(n%2 == 1) {
				
				if(onListener != null) {
					
					onListener.onNumberGet(TYPE.ODD, n);
				}
				
			}
			else if(n%2==0) {
				
				if(onListener != null) {
					
					onListener.onNumberGet(TYPE.EVEN, n);


				}
				
			}
		}
		
			
			 

	}
}



	

