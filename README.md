# Minimum Triangle Path

This is a small application that reads from a text file with the triangle of integer nodes 
structure and finds the path of adjacent nodes with the minimum summed value. 

In order to run this application you need to clone this repository

```
git clone git@github.com:xDavidRTx/minimum_triangle_path.git
```

Then build the fat-jar using

```
 sbt assembly
```

Then you just need to pass the path to the file. For example if we one of the file on resources: 

```
cat src/main/resources/data_big.txt | java -jar target/scala-3.6.1/MinimumTrianglePath.jar
```

