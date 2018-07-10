package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTests {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    wd.get("http://localhost/addressbook/");
    login("user", "admin", "pass", "secret", By.xpath("//form[@id='LoginForm']/input[3]"));
  }

  private void login(String user, String admin, String pass, String secret, By xpath) {
    initGroupCreation(user);
    wd.findElement(By.name(user)).clear();
    wd.findElement(By.name(user)).sendKeys(admin);
    initGroupCreation(pass);
    wd.findElement(By.name(pass)).clear();
    wd.findElement(By.name(pass)).sendKeys(secret);
    wd.findElement(xpath).click();
  }

  @Test
  public void testGroupCreation() {

    gotoGroupPage("groups");
    initGroupCreation("new");
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    initGroupCreation("submit");
    wd.findElement(By.cssSelector("div.msgbox")).click();
    gotoGroupPage("group page");
  }

  private void fillGroupForm(GroupData groupData) {
    wd.findElement(By.id("content")).click();
    login("group_name", groupData.getName(), "group_header", groupData.getHeader(), By.name("group_footer"));
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private void initGroupCreation(String s) {
    wd.findElement(By.name(s)).click();
  }

  private void gotoGroupPage(String groups) {
    wd.findElement(By.linkText(groups)).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
