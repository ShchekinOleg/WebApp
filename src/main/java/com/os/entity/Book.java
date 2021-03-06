package com.os.entity;

import java.util.List;
import java.util.Objects;

public class Book {
    private final int id;
    private final String title;
    private final int numberOfPages;
    private final Author author;
    private final boolean isAvailable;
    private final String address;
    private final Reader reader;
    private final String bookLanguage;
    private final int publicationYear;
    private final String publicationOffice;
    private List<BookAttribute> bookAttributes;
    private final Language language;
    private final String base64Image;

    private Book(int id, String title, int numberOfPages, Author author, boolean isAvailable,
                 String address, Reader reader, String bookLanguage, int publicationYear,
                 String publicationOffice, List<BookAttribute> bookAttributes, Language language, String base64Image) {
        this.id = id;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isAvailable = isAvailable;
        this.address = address;
        this.reader = reader;
        this.bookLanguage = bookLanguage;
        this.publicationYear = publicationYear;
        this.publicationOffice = publicationOffice;
        this.bookAttributes = bookAttributes;
        this.language = language;
        this.base64Image = base64Image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAddress() {
        return address;
    }

    public Reader getReader() {
        return reader;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublicationOffice() {
        return publicationOffice;
    }

    public List<BookAttribute> getBookAttributes() {
        return bookAttributes;
    }

    public Language getLanguage() {
        return language;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookAttributes(List<BookAttribute> bookAttributes) {
        this.bookAttributes = bookAttributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                getNumberOfPages() == book.getNumberOfPages() &&
                isAvailable() == book.isAvailable() &&
                getPublicationYear() == book.getPublicationYear() &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getAddress(), book.getAddress()) &&
                Objects.equals(getReader(), book.getReader()) &&
                Objects.equals(getBookLanguage(), book.getBookLanguage()) &&
                Objects.equals(getPublicationOffice(), book.getPublicationOffice()) &&
                Objects.equals(getBookAttributes(), book.getBookAttributes()) &&
                Objects.equals(getLanguage(), book.getLanguage()) &&
                Objects.equals(getBase64Image(), book.getBase64Image());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getTitle(), getNumberOfPages(), getAuthor(), isAvailable(), getAddress(), getReader(), getBookLanguage(), getPublicationYear(), getPublicationOffice(), getBookAttributes(), getLanguage(), getBase64Image());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author=" + author +
                ", isAvailable=" + isAvailable +
                ", address='" + address + '\'' +
                ", reader=" + reader +
                ", bookLanguage='" + bookLanguage + '\'' +
                ", publicationYear=" + publicationYear +
                ", publicationOffice='" + publicationOffice + '\'' +
                ", bookAttributes=" + bookAttributes +
                ", language=" + language +
                ", base64Image='" + base64Image + '\'' +
                '}';
    }

    public static class BookBuilder {

        private int id;
        private String title;
        private Author author;
        private int numberOfPages;
        private boolean isAvailable;
        private String address;
        private Reader reader;
        private String bookLanguage;
        private int publicationYear;
        private String publicationOffice;
        private List<BookAttribute> bookAttributes;
        private Language language;
        private String base64Image;

        public BookBuilder() {
        }

        public BookBuilder setId(final int id) {
            this.id = id;
            return this;
        }

        public BookBuilder setTitle(final String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setNumberOfPages(final int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public BookBuilder setAvailable(final boolean available) {
            isAvailable = available;
            return this;
        }

        public BookBuilder setAddress(final String address) {
            this.address = address;
            return this;
        }

        public BookBuilder setReader(final Reader reader) {
            this.reader = reader;
            return this;
        }

        public BookBuilder setBookLanguage(final String bookLanguage) {
            this.bookLanguage = bookLanguage;
            return this;
        }

        public BookBuilder setPublicationYear(final int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder setPublicationOffice(final String publicationOffice) {
            this.publicationOffice = publicationOffice;
            return this;
        }

        public BookBuilder setBookAttributes(final List<BookAttribute> bookAttributes) {
            this.bookAttributes = bookAttributes;
            return this;
        }

        public BookBuilder setLanguage(final Language language) {
            this.language = language;
            return this;
        }

        public BookBuilder setBase64Image(final String base64Image) {
            this.base64Image = base64Image;
            return this;
        }

        public BookBuilder setAuthor(final Author author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(id, title, numberOfPages, author, isAvailable, address,
                    reader, bookLanguage, publicationYear, publicationOffice, bookAttributes, language, base64Image);
        }
    }

}
