public class Book {
    String title;
    String author;
    boolean isAvailable;

    //Constructor
    public Book (String bookTitle, String bookAuthor){
        this.title=bookTitle;
        this.author=bookAuthor;
        this.isAvailable=true;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public void setAvailable(boolean available){
        this.isAvailable=available;
    }
    @Override
    public String toString(){
        return "Book Title: " +this.title + "Author: " +this.author + "Available: "+this.isAvailable;
    }
}

