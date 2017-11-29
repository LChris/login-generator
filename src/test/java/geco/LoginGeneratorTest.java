package geco;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LoginGeneratorTest {
    private LoginGenerator loginGenerator;
    private LoginService loginService;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP",
                "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenomOK() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertThat(test, is("PDUR"));
    }

    @Test
    public void generateLoginForJRAL2() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertThat(test, is("JRAL2"));
    }

    @Test
    public void loginPDUR2() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertThat(test, is("PDUR"));
    }

    @Test
    public void loginForJR0L1() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertThat(test, is("JROL1"));
    }

    @Test
    public void loginPDU() throws Exception {
        String test = loginGenerator.generateLoginForNomAndPrenom("Du", "Paul");
        assertThat(test, is("PDU"));
    }

}