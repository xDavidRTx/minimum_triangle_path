package services

import model.{Node, Triangle, TriangleRow}

import scala.io.Source

object DataLoader {
  def loadData(): Triangle = Triangle(Source.stdin.getLines().map(fromStringLine).toList)

  private def fromStringLine(input: String): TriangleRow = TriangleRow(input.trim.split("\\s+").toList.map(n => Node(n.toInt)))
}

