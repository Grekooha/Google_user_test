package Google.GoogleSearchTest

import Google.Method.GoogleTestMethod
import org.scalatest.flatspec.AnyFlatSpec

class GoogleTestAnyFlatSpec extends AnyFlatSpec {
  private val page = new GoogleTestMethod()

  "The method" should "open the site" in {
    page.openGoogle()
  }
  it should "input text and press enter" in {
    page.inputTextAndPressEnter("selenide")
  }
  it should "assert has the result" in {
    page.assertHasResult("Selenide: concise UI tests in Java")
  }
}