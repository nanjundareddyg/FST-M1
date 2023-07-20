package activities;
	abstract class Book {
	    String Title;
	    abstract void setTitle(String s);
	    
	    String getTitle() {
	        return Title;
	    }
	}

	class MyBook extends Book {
	   
	    public void setTitle(String TITLE) {
	        Title = TITLE;
	    }
	}

	public class Activity5 {
	    
	    public static void main(String []args) {
	   	        String title = "Ikiagi";
	   	        Book newNovel = new MyBook();
		        newNovel.setTitle(title);
	    System.out.println("The title is: " + newNovel.getTitle());
	    }
	}


