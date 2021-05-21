package Google

import com.codeborne.selenide.{CollectionCondition, Condition}
import com.codeborne.selenide.Selenide.{$, $$, open}
import org.openqa.selenium.By

class GoogleTestMethod {
  def openGoogle(): Unit =
    open("http://www.google.com")


  def inputTextAndPressEnter(text: String): Unit = {
    $(By.name("q"))
      .setValue(text)
      .pressEnter()
  }

  def assertHasResult(): Unit = {
    $$("#search .g").shouldHave(CollectionCondition.size(15))
    $("#search .g")
      .shouldHave(Condition.text("Selenide: concise UI tests in Java"))
      .shouldBe(Condition.visible)
  }
}