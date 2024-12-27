package io.github.guimatech.admin.catalogo.domain;

public class Identifier extends ValueObject {
    private final String value;

    public Identifier(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
