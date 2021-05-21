package Google

import org.scalatest.freespec.AnyFreeSpec

class GoogleTestAnyFreeSpec extends AnyFreeSpec {
  private val page = new GoogleTestMethod()

  "execute joint code from separate method" in {
    page.openGoogle()
    page.inputTextAndPressEnter("selenide")
    page.assertHasResult()
  }
}