package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Testtest", "Test2", "+71234562574", "test@user.com", "Tets"), true);
    app.getContactHelper().submitContactCreation("//div[@id='content']/form/input[21]");
  }


}
