
import java.util.*;


public class book {
    public static void main(String[] args) {

        librarymanager lib = new librarymanager();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("\n1.Add 2.View 3.Borrow 4.Return 5.Exit: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("ID, Title, Author: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String title = sc.nextLine();
                    String author = sc.nextLine();

                    lib.addBook(id, title, author);
                }
                case 2 -> lib.viewBooks();
                case 3 -> {
                    System.out.print("Book ID and Your Name: ");
                    lib.borrowBook(sc.nextInt(), sc.next());
                }
                case 4 -> {
                    System.out.print("Book ID: ");
                    lib.returnBook(sc.nextInt());
                }
                case 5 -> System.exit(0);
            }
        }
    }
}


class bookobj{
    int bookid;
    String title;
    String author;
    boolean isAvailable;

    bookobj(int bookid, String title, String author) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookid + "\nTitle: " + title + "\nAuthor: " + author + "\nAvailable: " + isAvailable;
    }

}



class librarymanager{

    private HashMap<Integer, bookobj> bookmap = new HashMap<>();
    private Queue<String> waitinglist = new LinkedList<>();

    void addBook(int id, String title, String author) {
        bookobj newbook = new bookobj(id, title, author);
        bookmap.put(id, newbook);
        System.out.println("Book added: " + newbook);
    }

    void viewBooks() {
        if (bookmap.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        bookmap.values().forEach(System.out::println);
    }

    void borrowBook(int id, String borrower) {
        bookobj book = bookmap.get(id);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println(borrower + " borrowed: " + book);
        } else {
            waitinglist.add(borrower);
            System.out.println("Book is currently unavailable. Added to waiting list.");
        }
    }

    void returnBook(int id) {
        bookobj book = bookmap.get(id);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!waitinglist.isEmpty()) {
            String nextuser = waitinglist.poll();
            book.isAvailable = false;
            System.out.println("Next in waiting list borrowed: " + nextuser);
        }else{
            book.isAvailable = true;
            System.out.println("Book returned, it is now available : " + book);
        }
    }
}