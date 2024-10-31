package model

case class Node(value: Int) extends AnyVal

case class NodePath(sum: Int, nodes: List[Node]) {
  def addNode(node: Node): NodePath = NodePath(sum + node.value, node :: nodes)

  def printResult(): Unit = println(s"Minimal path is: ${nodes.map(_.value).mkString(" + ")} = $sum")

}
