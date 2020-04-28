package com.awesome.testing

import java.math.BigDecimal

enum class Figure {
  SUM, SUB, MUL, DIV, NONE;

  fun calc(arg1: BigDecimal, arg2: BigDecimal): BigDecimal =
    when (this) {
      SUM -> arg1.plus(arg2)
      SUB -> arg1.minus(arg2)
      MUL -> arg1.multiply(arg2)
      DIV -> arg1.divide(arg2, 8, BigDecimal.ROUND_HALF_UP)
      NONE -> arg2
    }
}
