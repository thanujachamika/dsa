
public class LinkList {
	private Mark first;
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(double avgMark) {
		Mark newMark = new Mark(avgMark);
		newMark.next = first;
		first = newMark;
	}
	
	public void findMinimum() {
		Mark current = first;
		Mark previous = first;
		Mark min = null;
		
		while(current != null) {
			if(current.avgMark < previous.avgMark) {
				min = current;
			}
			previous = current;
			current = current.next;
		}
		System.out.println("Lowest mark : " +min.avgMark);	
	}
	
	public void diplayList() {
		Mark current = first;
		
		while(current != null) {
			current.displayMark();
			current = current.next;
		}
		
		System.out.println();
	}
}
