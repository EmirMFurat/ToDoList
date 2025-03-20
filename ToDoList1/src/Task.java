
public class Task {
	
	private String name;
	private boolean isComp;
	
	public Task(String name) {
		this.name=name;
		this.isComp= false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public boolean isComp() {
		return isComp;
	}
	public void setComp(boolean comp) {
		isComp=comp;
	}
	@Override
	public String toString() {
		return(isComp ? "[+]": "[ ]")+name;
	}
	
	
	
	public static void main(String[] args) {

	}

}
