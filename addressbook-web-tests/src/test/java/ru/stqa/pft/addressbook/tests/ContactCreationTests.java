package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;

/**
 * Created by Админ on 02.03.2018.
 */
public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().initContactCreation();
    File photo = new File("src/test/resources/stru.png");
    app.getContactHelper().fillContactForm(
            new ContactData().withFname("Test").withLname("Testov").withCity("Moscow").withPhone("+7(123)-456-78-90").withPhoto(photo), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }
}

