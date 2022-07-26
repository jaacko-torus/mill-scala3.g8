package $package$.$name;format="snake"$

import org.scalatest.funsuite.AnyFunSuite

class TestSuite extends AnyFunSuite {
  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
