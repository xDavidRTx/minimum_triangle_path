import services.DataLoader

object MinimumTrianglePath extends App {
   DataLoader.loadData().calculateMinPath().printResult()
}