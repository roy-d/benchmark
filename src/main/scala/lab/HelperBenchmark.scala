package lab

import org.openjdk.jmh.annotations.Benchmark

class HelperBenchmark {

  @Benchmark
  def badMax(): Unit = {
    Helper.badMax((1 to 1000000).toList)
  }

  @Benchmark
  def goodMax(): Unit = {
    Helper.goodMax((1 to 1000000).toList)
  }
}
