package Google

import com.codeborne.selenide.Selectors.byText
import com.codeborne.selenide.Selenide.{$, $$, open}
import com.codeborne.selenide.{CollectionCondition, Condition, ElementsCollection}
import org.openqa.selenium.By

class Google {
  private val selectSearchField: ElementsCollection = $$("#search .g")
  private val url: String = "http://www.google.com"
  private val username = "test.grekooha"
  private val password = "Qazxc31367"
  private val entryField = $(By.name("q"))
  private val button = $(byText("Sign in"))
  private val enterLogin = $("#identifierId")
  private val enterPassword = $("#password input")

  def openGoogle(): Google = {
    open(url)
    this
  }

  def inputText(searchText: String): Google = {
    entryField
      .setValue(searchText)
      .pressEnter()
    this
  }

  def hasResult(assertHasResultText: String): Google = {
    selectSearchField.shouldHave(CollectionCondition.size(15) )
    selectSearchField.first()
      .shouldHave(Condition.text(assertHasResultText))
      .shouldBe(Condition.visible)
    this
  }

  def pressButtonSignIn(): Google = {
    button
    .pressEnter()
    this
  }

  def login(): Google = {
    enterLogin.setValue(username).pressEnter
    enterPassword.setValue(password).pressEnter
    this
  }
}