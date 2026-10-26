package org.example;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String isCheckedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String isCheckedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.isCheckedOutTo = isCheckedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public String getIsCheckedOutTo() {
        return isCheckedOutTo;
    }

    public void setIsCheckedOutTo(String isCheckedOutTo) {
        this.isCheckedOutTo = isCheckedOutTo;
    }

    public void checkOut(String name) {
        isCheckedOut = true;
        isCheckedOutTo = name;
    }

    public void checkIn() {
        isCheckedOut = false;
        isCheckedOutTo = null;
    }
}
