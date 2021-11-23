package Homework.Author;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
            } else {
                System.err.println("invalid email");


            }
        }
    }

    public void countByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                count++;
            } else {
                System.err.println("invalid email");
            }
        }
        System.out.println("Author with this email has " + count + " writhed books");
    }

    public Book getTitle(String title) {
        for ( int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            } else {
                System.err.println("invalid title");
            }
        }
        return null;
    }
}