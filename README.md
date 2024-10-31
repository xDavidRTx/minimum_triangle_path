# Minimum Triangle Path

This application reads a text file representing a triangle of integer nodes and finds the path of adjacent nodes with the minimum summed value.

## Getting Started

### Installation

Clone this repository to your local machine:

```bash
git clone git@github.com:xDavidRTx/minimum_triangle_path.git
```

Building the Project
After cloning the repository, navigate to the project directory and build a fat JAR file using:

```bash
sbt assembly
```

This command will generate a runnable JAR file in the target/scala-3.6.1/ directory.

### Running the Application
Once the JAR file is built, you can run the application by providing it with the path to the input file. For example, to use a sample file from the resources directory, you can run:

```bash
cat src/main/resources/example.txt | java -jar target/scala-3.6.1/MinimumTrianglePath.jar```
```

### Input File Format
The input file should be structured as a triangle, where each line represents a row of integers. For example:

```markdown
7
6 3
3 8 5
11 2 10 9
```

Each line contains integers separated by spaces, where each integer represents a node in the triangle

### Example Output
For an input triangle like the one above, the application will output the minimum path sum and the corresponding path of nodes.

```markdown
Minimal path is: 7 + 6 + 3 + 2 = 18
```