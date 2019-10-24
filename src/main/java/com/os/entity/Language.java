package com.os.entity;

import java.util.Objects;

public class Language {
    private int id;
    private String languageName;

    public Language(int id, String languageName) {
        this.id = id;
        this.languageName = languageName;
    }

    public int getId() {
        return id;
    }

    public String getLanguageName() {
        return languageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Language)) return false;
        Language language = (Language) o;
        return getId() == language.getId() &&
                Objects.equals(getLanguageName(), language.getLanguageName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getLanguageName());
    }

    public static class LanguageBuilder {
        private int id;
        private String languageName;

        public LanguageBuilder() {
        }

        public LanguageBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public LanguageBuilder setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }

        public Language build() {
            return new Language(this.id, this.languageName);
        }
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", languageName='" + languageName + '\'' +
                '}';
    }
}
