package io.github.guimatech.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(final Error anError);
    ValidationHandler append(final ValidationHandler aHandler);
    ValidationHandler validate(final Validation aValidation);
    List<Error> getErrors();

    default boolean hasErrors() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    interface Validation {
        void validate();
    }
}
