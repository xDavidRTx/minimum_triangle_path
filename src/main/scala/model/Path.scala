package model

case class None(value: Int) extends AnyVal

case class Path(sum: Int, nodes: List[None])
