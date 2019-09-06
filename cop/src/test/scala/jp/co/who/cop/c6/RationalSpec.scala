package jp.co.who.cop.c6

import wvlet.airspec.AirSpec

class RationalSpec extends AirSpec {

  def `constructor test`(): Unit = {
    val a = new Rational(3, 4)
    a shouldBe "3/4"

    val b = new Rational(2, 4)
    b shouldBe "1/2"

    val c = new Rational(2, 0)
    c shouldBe "2"
  }

}
