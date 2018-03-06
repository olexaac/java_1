package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;

/**
 * Created by Админ on 02.03.2018.
 */

public class ContactDeletionTests extends TestBase {

  @Test (enabled = false)
  public void testContactDeletion() {
    app.goTo().gotoContactPage();
    app.getContactHelper().editContact();
    app.getContactHelper().deleteEditContacts();
    app.goTo().gotoContactPage();
  }
}