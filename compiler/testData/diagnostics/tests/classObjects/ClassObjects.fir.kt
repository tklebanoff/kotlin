// !DIAGNOSTICS: -DUPLICATE_CLASS_NAMES
package Jet86

class A {
  companion object {
    val x = 1
  }
  companion object {
    val x = 1
  }
}

class AA {
  companion object {
    val x = 1
  }
  companion object A {
    val x = 1
  }
    companion object AA {
    val x = 1
  }
}

class B() {
  val x = 12
}

object b {
  companion object {
    val x = 1
  } // error
}

val a = A.x
val c = B.<!UNRESOLVED_REFERENCE!>x<!>
val d = b.<!UNRESOLVED_REFERENCE!>x<!>

val s = System  // error
fun test() {
  System.out.println()
  java.lang.System.out.println()
}