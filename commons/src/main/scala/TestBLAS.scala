import smile.math.blas.BLAS

object TestBLAS extends App {
  println(BLAS.getInstance().asum(Array(1.0, 2.0)))
}
