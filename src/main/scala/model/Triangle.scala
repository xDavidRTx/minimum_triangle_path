package model

import scala.collection.parallel.CollectionConverters._

case class TriangleRow(nodes: List[Node])

case class Triangle(rows: List[TriangleRow]) {
  def calculateMinPath(): NodePath = { //foldRight to be able to bottom up the triangle
    this.rows.foldRight(List.fill(this.rows.length + 1)(NodePath(0, List.empty[Node]))) { (triangleRow, nodePathAcc) =>
      triangleRow.nodes.indices.par.map { j =>
        val leftPath = nodePathAcc(j)
        val rightPath = nodePathAcc(j + 1)
        if (leftPath.sum < rightPath.sum) leftPath.addNode(triangleRow.nodes(j)) else rightPath.addNode(triangleRow.nodes(j))
      }.toList
    }
  }.minBy(_.sum)
}
