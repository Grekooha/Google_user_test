package Google

import org.scalatest.freespec.AnyFreeSpec

class GooglePageV2 extends AnyFreeSpec {
  private val page = new Google()

  "execute joint code from separate method" in {
    page.openGoogle()
    page.inputText("selenide")
    page.assertHasResult("Selenide: concise UI tests in Java")
    page.openGoogle()
    page.pressButton("Sign in")
    page.login()
  }
}