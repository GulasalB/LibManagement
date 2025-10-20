//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1=new Book ("Hunger games", "Suzanne Collins");
        Book book2=new Book ("1984", "George Orwell");

    Member member1=new Member("Ali");
    Member member2=new Member("Aisha");

    System.out.println("--- Library Open! ---");
    System.out.println("Initial Book Status:");
    System.out.println(book1); // Uses our handy toString() method!
    System.out.println(book2);
    System.out.println("---------------------------------");

    // --- Step 3: Ali borrows a book ---
        member1.borrowBook(book1);

        System.out.println("\n--- After Ali borrows 'The Hobbit' ---");
        System.out.println(book1); // Let's check the book's status now
        System.out.println("Ali's borrowed books: " + member1.getBorrowedBooks());
        System.out.println("---------------------------------");

    // --- Step 4: Aisha tries to borrow the SAME book ---
        System.out.println("\n--- Aisha tries to borrow 'The Hobbit' ---");
        member2.borrowBook(book1); // This should fail!
        System.out.println("---------------------------------");

    // --- Step 5: Ali returns the book ---
        System.out.println("\n--- Ali returns 'The Hobbit' ---");
        member1.returnBook(book1);

        System.out.println("\n--- After Ali returns 'The Hobbit' ---");
        System.out.println(book1); // Status should be available again
        System.out.println("Ali's borrowed books: " + member1.getBorrowedBooks());
        System.out.println("---------------------------------");

    // --- Step 6: Aisha borrows the book successfully ---
        System.out.println("\n--- Aisha tries to borrow 'The Hunger Games' again ---");
        member2.borrowBook(book1); // This should now work!

        System.out.println("\n--- After Aisha borrows 'The Hunger Games' ---");
        System.out.println(book1); // Status should be unavailable
        System.out.println("Aisha's borrowed books: " + member2.getBorrowedBooks());
        System.out.println("---------------------------------");
}
}


