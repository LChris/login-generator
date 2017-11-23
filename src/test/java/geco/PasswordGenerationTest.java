package geco;

import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PasswordGenerationTest {
    private PasswordGeneration passwordGeneration;

    @Test
    public void getRandomPassword() throws Exception {
        passwordGeneration = new PasswordGeneration();

        String pass = passwordGeneration.getRandomPassword();

        assertThat(pass.length(), is(8));
    }

}