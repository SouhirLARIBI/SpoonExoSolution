This program extracts all the statements found in the java classes of a source directory (which is given in parameter).
For this Spoon is used:  http://spoon.gforge.inria.fr/

Example of use:
mvn package
java -jar target/Exo-1.0-SNAPSHOT-jar-with-dependencies.jar src/java/main


Exo:
extract all the access to local variables found in these statements. For this, you can use the visitor pattern.

For a example of output, see example_output