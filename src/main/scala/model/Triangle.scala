package model

case class TriangleRow(nodes: List[Node])

case class Triangle(rows: List[TriangleRow])


object Triangle {
  def fromStringLine(input: String): TriangleRow = TriangleRow(input.trim.split("\\s+").map(n => Node(n.toInt)).toList)
}
