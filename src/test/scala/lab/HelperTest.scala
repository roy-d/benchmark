package lab

import org.scalatest._

class HelperTest extends FlatSpec with Matchers {

  "Helper" should "find the max of as using badMax" in {
    val max = Helper.badMax((1 to 1000000).toList)
    max should be (1000000)
  }

  it should "find the max of as using goodMax" in {
    val max = Helper.goodMax((1 to 1000000).toList)
    max should be (1000000)
  }

}
