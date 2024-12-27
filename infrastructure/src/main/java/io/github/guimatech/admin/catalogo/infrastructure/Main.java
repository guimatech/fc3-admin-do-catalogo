package io.github.guimatech.admin.catalogo.infrastructure;

import io.github.guimatech.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(new UseCase().execute());
    }
}