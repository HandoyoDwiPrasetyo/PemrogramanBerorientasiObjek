package com.kuliah;

public class Book {
    private String titleBook, genreBook;
    private int widthBook;

    void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    void setGenreBook(String genreBook) {
        this.genreBook = genreBook;
    }

    String getGenre() {
        return genreBook;
    }

    void setWidthBook(int widthBook) {
        this.widthBook = widthBook;
    }

    int getWidth() {
        return widthBook;
    }

}
