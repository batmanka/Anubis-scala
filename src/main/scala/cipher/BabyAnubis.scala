package cipher

import org.ejml.data.DMatrix2x2

/**
  * Created by hatasova on 03/11/2017.
  */
class BabyAnubis extends Cipher {


 def prepareMatrices() = {
   inputMatrix = new DMatrix2x2(inputData(0).toDouble, inputData(1).toDouble, inputData(2).toDouble, inputData(3).toDouble)
 }

}
