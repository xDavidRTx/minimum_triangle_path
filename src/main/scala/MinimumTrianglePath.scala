import services.DataLoader

object MinimumTrianglePath extends App {
  val triangle = DataLoader.loadData()
  triangle.rows.foreach(println)
}