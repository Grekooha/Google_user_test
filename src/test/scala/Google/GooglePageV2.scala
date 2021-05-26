package Google

import org.scalatest.freespec.AnyFreeSpec

class GooglePageV2 extends AnyFreeSpec {
  private val page = new Google()

  "execute joint code from separate method" in {
    page.openGoogle()
    page.inputText("selenide")
    page.hasResult("Selenide: concise UI tests in Java")
    page.openGoogle()
    page.pressButtonSignIn()
    page.authorisation()
  }
}