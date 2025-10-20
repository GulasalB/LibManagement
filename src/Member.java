import java.util.ArrayList;

public class Member {
    String name;
    ArrayList<Book> BorrowedBooks;

    public Member (String name){
        this.name=name;
        this.BorrowedBooks=new ArrayList<Book>();
    }
    public String getName (){
        return this.name;
    }

    public ArrayList<Book> getBorrowedBooks (){
        return this.BorrowedBooks;
    }
    public void borrowBook(Book book){
        if(book.isAvailable()){
            book.setAvailable(false);
            this.BorrowedBooks.add(book);
        } else{
            System.out.println("Sorry "+book.getTitle()+" is not available");
        }

    }
    public void returnBook(Book book){
        if (this.BorrowedBooks.contains(book)){
            book.setAvailable(true);
            this.BorrowedBooks.remove(book);
            System.out.println("Book " + book.getTitle() + " has been returned");
        } else {
            System.out.println("Sorry "+book.getTitle()+" is not available");
        }
    }
}
