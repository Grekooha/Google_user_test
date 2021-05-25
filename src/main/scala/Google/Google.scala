package Google

import com.codeborne.selenide.Selenide.{$, $$, open}
import com.codeborne.selenide.{CollectionCondition, Condition}
import org.openqa.selenium.By

class Google {
  val cssSelector: String = "#search .g"
  val url: String = "http://www.google.com"

  def openGoogle(): Unit =
    open(url)

  def inputText(searchText: String): Unit = {
    $(By.name("q"))
      .setValue(searchText)
      .pressEnter()
  }

  def assertHasResult(assertHasResultText: String): Unit = {
    $$(cssSelector).shouldHave(CollectionCondition.size(15))
    $(cssSelector)
      .shouldHave(Condition.text(assertHasResultText))
      .shouldBe(Condition.visible)
  }
}