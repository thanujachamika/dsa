
public class Mark {
	public double avgMark;
	public Mark next;
	
	public Mark(double avgMark) {
		this.avgMark = avgMark;
		next = null;
	}
	
	public void displayMark() {
		System.out.print(avgMark +" ");
	}
	
}
