package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase  {

  @Test
  public void testGroupCreation() throws Exception {

    initGroupCreation();
    fillGroupForm(new GroupData("test2", "test3", "test4"));
    submitGroupCreation();
    returtToGroupPage();
    logOut();
  }


}
