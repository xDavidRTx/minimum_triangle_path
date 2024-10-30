package services

import model.Triangle
import model.Triangle.fromStringLine

import scala.io.Source

object DataLoader {
  def loadData(): Triangle = Triangle(Source.stdin.getLines().map(fromStringLine).toList)
}

