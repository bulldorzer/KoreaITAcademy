package array;

public class Movie {
	
	String title;
	String dirctor;
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirctor() {
		return dirctor;
	}
	public void setDirctor(String dirctor) {
		this.dirctor = dirctor;
	}
	
	public Movie() {
		super();
	}
	public Movie(String title, String dirctor) {
		super();
		this.title = title;
		this.dirctor = dirctor;
	}
	
	@Override
	public String toString() {
		return "Book - title=" + title + ", dirctor=" + dirctor;
	}
	
	
	
}
