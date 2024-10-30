package model

case class Node(value: Int) extends AnyVal

case class Path(sum: Int, nodes: List[Node])
