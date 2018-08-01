package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Test test", "Test3", "+71234562574", "test@user.com"));
    app.getContactHelper().submitContactCreation("//div[@id='content']/form/input[21]");
  }


}