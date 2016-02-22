package lab

object Helper {

  def goodMax(as: List[Int]):Int = as.max

  def badMax(as: List[Int]):Int = as.sortWith(_ < _).max
}
