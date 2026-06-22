package Constructors;

public class Book {

    static int totalBook;

    String isbn_no;
    String title;
    String author;
    boolean isBorrowed;

    static {
        totalBook = 0;
    }
    {
        totalBook++;
    }

    Book(String title , String author , String isbn){
        this.isbn_no = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this("Unknown" , "Unknown", isbn);
    }

    static int getTotalNoOfBook(){
        return totalBook;
    }
    public void borrowBook(){
        if (isBorrowed){
            System.out.println("The Book You Want to Borrow is not available");
        }else {
                this.isBorrowed = true;
            System.out.println("Enjoy your Book!");
        }
    }

    public void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope You Enjoyed the book!");
        }else {
            System.out.println("Please Borrow the book to return the book you dumAss!");
        }
    }
    public static void main(String []args) {
        Book myBook = new Book("GOT", "Beast", "1326589478234");
        Book GameOfThrones = new Book("1", "Game of Thrones", "23121313132");
        myBook.borrowBook();
        GameOfThrones.borrowBook();
        myBook.returnBook();
        GameOfThrones.borrowBook();
        System.out.println(Book.getTotalNoOfBook());
    }
}
