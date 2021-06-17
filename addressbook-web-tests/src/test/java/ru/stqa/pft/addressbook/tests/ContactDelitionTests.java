package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDelitionTests extends TestBase{

  @Test

  public void testContactDelition() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Kate", "LL", "Ziankovich", "Kate_Z", "AQA", "Company", "Belarus", "3564785", "4563728", "56729746", "67820874", "bhaktinkatya@gmail.com", "katya4251@yandex.ru", "katya@gmail.com", "test2"), true);
  }
  app.getContactHelper().chooseContact();
  app.getContactHelper().clickDelete();
  app.getContactHelper().acceptAlert();



  }
}
