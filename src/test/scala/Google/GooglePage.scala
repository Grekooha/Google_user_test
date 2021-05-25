package Google

import org.scalatest.flatspec.AnyFlatSpec

class GooglePage extends AnyFlatSpec {
  private val page = new Google()

  "The method" should "open the site" in {
    page.openGoogle()
  }
  it should "input text and press enter" in {
    page.inputText("selenide")
  }
  it should "assert has the result" in {
    page.assertHasResult("Selenide: concise UI tests in Java")
  }
}