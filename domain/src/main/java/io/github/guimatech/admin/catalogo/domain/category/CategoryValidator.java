package io.github.guimatech.admin.catalogo.domain.category;

import io.github.guimatech.admin.catalogo.domain.validation.Error;
import io.github.guimatech.admin.catalogo.domain.validation.ValidationHandler;
import io.github.guimatech.admin.catalogo.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        if (this.category.getName() == null) {
            this.validatorHandler().append(new Error("'name' should not be null"));
        }
    }
}
