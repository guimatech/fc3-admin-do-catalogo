package io.github.guimatech.admin.catalogo.application;

import io.github.guimatech.admin.catalogo.domain.category.Category;

import static io.github.guimatech.admin.catalogo.domain.category.Category.newCategory;

public class UseCase {
    public Category execute() {
        return newCategory(
                "Category 1",
                "Category 1 description",
                true
        );
    }
}