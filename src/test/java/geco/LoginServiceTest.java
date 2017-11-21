package geco;

import org.hamcrest.core.IsSame;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

public class LoginServiceTest {
    private LoginService logins;
    private String test1 = "Choucroute";
    private String test2 = "Chouquettes";

    @Test
    public void testLoginExistsOK() throws Exception {
        logins = new LoginService(new String[]{test1});

        assertThat(logins.loginExists(test1), is(true));
    }

    @Test
    public void testAddLoginOK() throws Exception {
        logins = new LoginService(new String[]{"a"});

        logins.addLogin(test1);
        assertThat(logins.loginExists(test1), is(true));
    }

    @Test
    public void testFindAllLoginsStartingWithOK() throws Exception {
        logins = new LoginService(new String[]{"ble", test1, "fleh", test2});

        List<String> res = logins.findAllLoginsStartingWith("Chou");
        assertThat(res.contains(test1), is(true));
        assertThat(res.contains(test2), is(true));
    }

    @Test
    public void testFindAllLoginsOK() throws Exception {
        logins = new LoginService(new String[]{test2, test1});

        assertThat(logins.findAllLogins().contains(test2), is(true));
        assertThat(logins.findAllLogins().contains(test1), is(true));
    }

}