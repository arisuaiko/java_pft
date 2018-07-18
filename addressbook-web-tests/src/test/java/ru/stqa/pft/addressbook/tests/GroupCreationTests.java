package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage("groups");
    app.initGroupCreation("new");
    app.fillGroupForm(new GroupData("Tets", "Test1", "Test2"));
    app.submitGroupCreation("submit");
    app.returnToGroupPage("group page");
  }

}
