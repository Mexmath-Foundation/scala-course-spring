package karazin.unit4.challenge

import karazin.unit4.challenge.generators.given
import karazin.unit4.challenge.numerals.*
import org.scalacheck.*
import org.scalacheck.Prop.{forAll, propBoolean, throws}
import org.scalacheck.Test.Parameters

object NumeralsSpecification extends Properties("Numerals"):

  override def overrideParameters(p: Parameters): Parameters =
    p.withMinSuccessfulTests(50).withMaxDiscardRatio(100)

end NumeralsSpecification
