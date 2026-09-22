import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void passwordWithLessThanEightCharactersIsInvalid() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("abcdefg"));
    }
    
    @Test
    public void passwordMustContainAnUppercaseLetter() {

        PasswordValidator validator =
            new PasswordValidator();

        assertFalse(validator.isValid("abcdefgh"));
    }

}

