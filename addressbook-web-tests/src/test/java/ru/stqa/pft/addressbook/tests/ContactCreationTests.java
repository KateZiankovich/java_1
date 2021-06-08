package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{


  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().gotoAddNew();
    app.getContactHelper().fillContactForm(new ContactData("Kate", "LL", "Ziankovich", "Kate_Z", "AQA", "Company", "Belarus", "3564785", "4563728", "56729746", "67820874", "bhaktinkatya@gmail.com", "katya4251@yandex.ru", "katya@gmail.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returntoContactpage();
  }

}
