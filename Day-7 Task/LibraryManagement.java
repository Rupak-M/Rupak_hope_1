
class Book {
     String title;
     String author;
     String isbn;
     boolean isAvailable;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + isAvailable);
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' borrowed successfully!");
        } else {
            System.out.println("Book '" + title + "' is not available!");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book '" + title + "' returned successfully!");
    }
}

class FictionBook extends Book {
     String genre;
    public FictionBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}

class NonFictionBook extends Book {
    String subject;
    public NonFictionBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class TextBook extends Book {

     String subject;
    
    public TextBook(String title, String author, String isbn,String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}


class Library {
    Book[] books;
    int bookCount;
    
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added to library!\n");
        } else {
            System.out.println("Library is full!\n");
        }
    }
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library!\n");
            return;
        }
        System.out.println("===== LIBRARY INVENTORY =====");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("\n--- Book " + (i + 1) + " ---");
            books[i].displayInfo();
        }
        System.out.println();
    }
    
    public void searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book found!\n");
                books[i].displayInfo();
                return;
            }
        }
        System.out.println("Book not found!\n");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001", "Classic Romance"));
        library.addBook(new FictionBook("Harry Potter", "J.K. Rowling", "ISBN002", "Fantasy"));
        
        library.addBook(new NonFictionBook("Sapiens", "Yuval Noah Harari", "ISBN003", "History"));
        library.addBook(new NonFictionBook("Thinking, Fast and Slow", "Daniel Kahneman", "ISBN004", "Psychology"));
        

        library.addBook(new TextBook("Data Structures", "Mark Allen Weiss", "ISBN005",  "Computer Science"));
        library.addBook(new TextBook("Calculus", "James Stewart", "ISBN006","Mathematics"));
        
        library.displayAllBooks();
        
        System.out.println("===== SEARCHING FOR BOOK =====");
        library.searchBook("Harry Potter");

        System.out.println("===== BORROWING BOOK =====");
        FictionBook fictionBook = new FictionBook("1984", "George Orwell", "ISBN007", "Dystopian");
        fictionBook.borrowBook();
        fictionBook.returnBook();
        
    }
}