package Chapter9;

import java.util.Date;

public class TestStopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch object = new StopWatch();
		
		int[] n = new int[100000];
		for(int i=0;i<100000;i++) {
			n[i] =(int)(Math.random()*100);
		}
		
		selection(n);
		
		object.stop(object.getElapsedTime());
		
		long executeTime = object.getEndTime() - object.getStartTime();
		System.out.println("Ö´ÐÐÊ±¼ä" + executeTime + "Milliseconds.");
	}
	public static void selection(int[] list) {
		for(int i=0; i<list.length - 1;i++) {
			int currenMax = list[i];
			int currenMaxIndex = i;
		
			for(int j=i+1;j<list.length;j++) {
				if(currenMax < list[j]) {
					currenMax = list[j];
					currenMaxIndex = j;
				}
			}
			if(currenMaxIndex != i) {
				list[currenMaxIndex] = list[i];
				list[i] = currenMax;
			}
		}
		for(int i1= 0;i1<list.length;i1++) {
			System.out.print(" " +list[i1]);
		}
	}

}
class StopWatch{
	private long startTime;
	private long endTime;
	
	StopWatch(){
		Date date = new Date();
		startTime = date.getTime();
		
	}
	void start(long newstarttime){
		this.startTime = newstarttime;
	}
	void stop(long newendtime) {
		this.endTime = newendtime;
	}
	long getElapsedTime() {
		 Date time = new Date();
		 return time.getTime();
	}
	long getStartTime() {
		return startTime;
	}
	long getEndTime() {
		return endTime;
	}
}
