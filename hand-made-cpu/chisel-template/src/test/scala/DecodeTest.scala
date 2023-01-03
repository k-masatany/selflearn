package decode

import chisel3._
import org.scalatest.flatspec._
import chiseltest._
import fetch.Top

class HexTest extends AnyFlatSpec with ChiselScalatestTester {

  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      while (!c.io.exit.peek().litToBoolean) {
        c.clock.step(1)
      }
    }
  }

}
