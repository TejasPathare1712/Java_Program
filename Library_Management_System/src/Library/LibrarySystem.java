package Library;
import Library.BookManager;
import Library.MemberManager;
import Library.TransactionManager;

public class LibrarySystem {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        MemberManager memberManager = new MemberManager();
        TransactionManager transactionManager = new TransactionManager();

        // Add books and members
        bookManager.addBook("The Alchemist", "Paulo Coelho", 5);
        memberManager.addMember("John Doe", "john.doe@example.com");

        // Issue and return books
        transactionManager.issueBook(1, 1); // Member 1, Book 1
        transactionManager.returnBook(1);  // Transaction 1

        // View records
        bookManager.viewBooks();
        memberManager.viewMembers();
    }
}

