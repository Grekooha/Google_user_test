package Google.AnyFreeSpec

import Google.Method.GoogleTestMethod
import org.scalatest.freespec.AnyFreeSpec

class GoogleTestAnyFreeSpec extends AnyFreeSpec {
  private val page = new GoogleTestMethod()

  "execute joint code from separate method" in {
    page.openGoogle()
    page.inputTextAndPressEnter("selenide")
    page.assertHasResult("Selenide: concise UI tests in Java")
  }
}