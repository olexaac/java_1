package ru.stqa.pft.mantis.tests;

import org.testng.annotations.Test;

/**
 * Created by Админ on 06.04.2018.
 */
public class RegistrationTests extends TestBase {

  @Test
  public void testRegistration() {
    app.registration().start("user1", "user1@localhost.localdomain");
  }
}
