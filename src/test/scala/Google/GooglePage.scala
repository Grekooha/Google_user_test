package Google

import org.scalatest.flatspec.AnyFlatSpec

class GooglePage extends AnyFlatSpec {
  private val page = new Google()

  it should "open the site and input text and press enter" in {
    page.openGoogle()
    page.inputText("selenide")
  }
  it should "assert has the result" in {
    page.assertHasResult("Selenide: concise UI tests in Java")
  }
 it should "log in" in {
    page.openGoogle()
    page.pressButton("Sign in")
    page.login()
  }
}