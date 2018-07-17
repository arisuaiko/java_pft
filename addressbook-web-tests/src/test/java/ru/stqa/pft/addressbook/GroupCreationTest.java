package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test2", "Test3", "Test4"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
