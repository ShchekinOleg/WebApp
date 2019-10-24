package com.os.entity;

import java.util.Objects;

public class Reader {
    private final int id;
    private final String email;
    private final String password;
    private final String telephoneNumber;
    private final String firstName;
    private final String lastName;

    public Reader(int id, String email, String password, String telephoneNumber, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;
        Reader reader = (Reader) o;
        return getId() == reader.getId() &&
                Objects.equals(getEmail(), reader.getEmail()) &&
                Objects.equals(getPassword(), reader.getPassword()) &&
                Objects.equals(getTelephoneNumber(), reader.getTelephoneNumber()) &&
                Objects.equals(getFirstName(), reader.getFirstName()) &&
                Objects.equals(getLastName(), reader.getLastName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getEmail(), getPassword(), getTelephoneNumber(), getFirstName(), getLastName());
    }

    public static class ReaderBuilder {

        private int id;
        private String email;
        private String password;
        private String telephoneNumber;
        private String firstName;
        private String lastName;

        public ReaderBuilder() {
        }

        public ReaderBuilder setId(final int id) {
            this.id = id;
            return this;
        }

        public ReaderBuilder setEmail(final String email) {
            this.email = email;
            return this;
        }

        public ReaderBuilder setPassword(final String password) {
            this.password = password;
            return this;
        }

        public ReaderBuilder setTelephoneNumber(final String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public ReaderBuilder setLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ReaderBuilder setFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Reader build() {
            return new Reader(id, email, password, telephoneNumber, firstName, lastName);
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
