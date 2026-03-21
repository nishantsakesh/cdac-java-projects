package browser_history;
import java.util.*;

public interface browseroperations{
	void visitpage();
	void goback();
	void goforward();
	void showcurrentpage();
	void showhistory();	
}

class browsermanager implements browseroperations{
	Scanner s = new Scanner(System.in);
	String currentpage;
	
	Stack<String> backstack = new Stack<>();
	Stack<String> forwardStack = new Stack<>();

	@Override
	public void visitpage() {
		
		System.out.println("Enter the url:");
		String url = s.next();
		
		if(currentpage != null) {
			backstack.push(currentpage);			
		}
		forwardStack.clear();
		currentpage =url;
		System.out.println("Visited: "+ currentpage);		
	}
	
	

	@Override
	public void goback() {
		
		if(!backstack.isEmpty()) {
			forwardStack.push(currentpage);
			currentpage=backstack.pop();
		}else {
			System.out.println("No Previous Page.");
		}
	}
	
	

	@Override
	public void goforward() {
		
		if(!forwardStack.isEmpty()) {
			backstack.push(currentpage);
			currentpage=forwardStack.pop();
		}else {
			System.out.println("No forward page");
		}
		
	}
	
	

	@Override
	public void showcurrentpage() {
		if(currentpage!=null) {
			System.out.println("Current page: "+ currentpage);
		}else {
			System.out.println("No Current Page Open.");
		}
		
		
	}

	@Override
	public void showhistory() {
		System.out.println("\n--- Browser History ---");
		System.out.println("back stack: "+backstack);
		System.out.println("current page: "+(currentpage !=null ? currentpage:"None"));
		System.out.println("forward page: "+ forwardStack);
		System.out.println("-----------------------\n");
		
	}
	
}
