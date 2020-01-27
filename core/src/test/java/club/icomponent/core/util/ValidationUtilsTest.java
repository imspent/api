package club.icomponent.core.util;

import club.icomponent.core.exception.ValidationException;
import club.icomponent.core.spec.Validation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidationUtilsTest {

    @Test
    void validate() {
        Validation RIGHT_VALIDATION = () -> true;
        Validation FALSE_VALIDATION = () -> false;
        ValidationUtils.validate(RIGHT_VALIDATION);
        assertThrows(ValidationException.class, () -> ValidationUtils.validate(FALSE_VALIDATION));
    }
}