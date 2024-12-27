package io.github.guimatech.admin.catalogo.application;

import io.github.guimatech.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}