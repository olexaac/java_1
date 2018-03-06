package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Админ on 02.03.2018.
 */
public class ContactModificationTests extends TestBase {

  @Test (enabled = false)
  public void testContactModification(){
    app.goTo().gotoContactPage();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Testov", "Moscow", "+7(123)-456-78-90", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
  }
}