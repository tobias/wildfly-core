package org.jboss.as.controller.parsing;

import javax.xml.stream.XMLStreamException;

import org.projectodd.vdx.core.ValidationError;

public class XMLStreamValidationException extends XMLStreamException {
    public XMLStreamValidationException(final String message,
                                        final ValidationError validationError,
                                        final Throwable nested) {
        super(message, validationError.location(), nested);
        this.validationError = validationError;
    }

    public ValidationError getValidationError() {
        return validationError;
    }

    private final ValidationError validationError;
}
