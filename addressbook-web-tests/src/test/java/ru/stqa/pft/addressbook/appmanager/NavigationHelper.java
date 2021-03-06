package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
      super(wd);
  }

  public void GroupPage(String groups) {
      if (isElementPresent(By.tagName("h1"))
              && wd.findElement(By.tagName("h1")).getText().equals("Groups")
              && isElementPresent(By.name("new"))) {
          return;
      }
    wd.findElement(By.linkText(groups)).click();
  }

  public void gotoContactPage() {
      if (isElementPresent(By.id("maintable"))) {
          return;
      }
      wd.findElement(By.linkText("add new")).click();
  }

}
