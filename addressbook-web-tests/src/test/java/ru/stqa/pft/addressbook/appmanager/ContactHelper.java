package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returntoContactpage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"),contactData.getFirstname());
    //click(By.name("theform"));
    type(By.name("middlename"),contactData.getMiddlename());
    type(By.name("lastname"),contactData.getLastname());
    //click(By.xpath("//div[@id='content']/form/label[4]"));
    type(By.name("nickname"),contactData.getNickname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    //click(By.xpath("//div[@id='content']/form/label[11]"));
    type(By.name("home"),contactData.getHomephonenumber());
    type(By.name("mobile"),contactData.getMobilenumber());
    type(By.name("work"),contactData.getWorknumber());
    type(By.name("fax"),contactData.getFax());
    type(By.name("email"),contactData.getEmail());
    type(By.name("email2"),contactData.getEmail2());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void gotoAddNew() {
   click(By.linkText("add new"));
  }

  public void clickEdit() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void clickUpdate() {
    click(By.name("update"));
  }

  public void chooseContact() {
    click(By.name("selected[]"));
  }

  public void clickDelete() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public boolean acceptAlert() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
