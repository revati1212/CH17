package thischaining;

public class Book {
	
	    private String title;
	    private String author;
	    private double price;

	   
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        System.out.println("Book created with title: " + title + ", author: " + author + ", price: $" + price);
	    }

	    
	    public Book(String title, String author) {
	        this(title, author, 0.0); 
	    }

	   
	    public Book(String title) {
	        this(title, "Love at first sight"); 
	    }

	   
	    public Book() {
	        this("Untitled"); 
	    }

	    public void display() {
	        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
	    }
	}



