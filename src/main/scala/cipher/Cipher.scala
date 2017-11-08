package cipher

import org.ejml.data.Matrix
import cc.redberry.rings

import rings.poly.PolynomialMethods._
import rings.scaladsl._
import syntax._

/**
  * Created by hatasova on 03/11/2017.
  */

trait Cipher {
  def sbox:List[Int]
  def hadamardMatrix:Matrix
  def vandermondeMatrix:Matrix
  var numberOfBytes:Int
  val numberOfRounds = 12
  val numberOfFullRounds = numberOfRounds - 1
  var gf2_8 = GF(2, 8, "x")
}
