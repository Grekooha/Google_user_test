package Google

import org.scalatest.flatspec.AnyFlatSpec

class GooglePage extends AnyFlatSpec {
  private val page = new Google()

  "User " should "open the site and input text and press enter" in {
    page.openGoogle()
    page.inputText("selenide")
  }
  it should "assert has the result" in {
    page.hasResult("Selenide: concise UI tests in Java")
  }
  "User" should "log in" in {
    page.openGoogle()
    page.pressButtonSignIn()
    page.authorisation()
  }
}