
package com.owlcyberdefense.cobol1

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object Tests {
  lazy val runner = Runner("", "tests.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class Tests {
  import Tests._

  @Test def testCobol1 { runner.runOneTest("testCobol1") }

}
