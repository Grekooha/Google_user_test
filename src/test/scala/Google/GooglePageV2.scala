package Google

import org.scalatest.freespec.AnyFreeSpec

class GooglePageV2 extends AnyFreeSpec {
  private val page = new Google()

  "execute joint code from separate method" in {

    page
      .openGoogle()
      .inputText("selenide")
      .hasResult("Selenide: concise UI tests in Java")
      .openGoogle()
      .pressButtonSignIn()
      .login()

  }
}