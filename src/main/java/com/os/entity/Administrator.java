package com.os.entity;

import java.util.Objects;

public class Administrator {
    private final int id;
    private final String login;
    private final String password;

    public Administrator(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;
        Administrator that = (Administrator) o;
        return getId() == that.getId() &&
                Objects.equals(getLogin(), that.getLogin()) &&
                Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class AdministratorBuilder {
        private int id;
        private String login;
        private String password;

        public AdministratorBuilder() {
        }

        public AdministratorBuilder setId(final int id) {
            this.id = id;
            return this;
        }

        public AdministratorBuilder setPassword(final String password) {
            this.password = password;
            return this;
        }

        public AdministratorBuilder setLogin(final String login) {
            this.login = login;
            return this;
        }

        public Administrator build() {
            return new Administrator(id, login, password);
        }
    }
}
