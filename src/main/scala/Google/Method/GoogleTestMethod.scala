package Google.Method
import com.codeborne.selenide.Selenide.{$, $$, open}
import com.codeborne.selenide.{CollectionCondition, Condition}
import org.openqa.selenium.By

class GoogleTestMethod {
  def openGoogle(): Unit =
    open("http://www.google.com")


  def inputTextAndPressEnter(searchText: String): Unit = {
    $(By.name("q"))
      .setValue(searchText)
      .pressEnter()
  }

  def assertHasResult(assertHasResultText: String): Unit = {
    $$("#search .g").shouldHave(CollectionCondition.size(15))
    $("#search .g")
      .shouldHave(Condition.text(assertHasResultText))

      .shouldBe(Condition.visible)
  }
}