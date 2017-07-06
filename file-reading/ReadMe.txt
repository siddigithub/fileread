1) To kick off the test, change the following parameter to your local directory
e.g

final String TEST_FOLDER_BASE = "/Users/usachary/Downloads/file_code/src/test/resources";
to
final String TEST_FOLDER_BASE = "/Users/{?????}/Downloads/file_code/src/test/resources";

2)How to execute the test?
 
Test can be executed from both terminal and eclipse.
Terminal - Run "mvn clean install" - Tests will be executed and test results will be printed on the console.
Eclipse - Right click onthe src/test/java folder, and run as JUNIT test, Results will be shown on the eclipse console
and Junit run viewer.

3)Not implemented the java docs as the JUNIT tests case names are self explanatory. Javadocs can be generated in maven build
if required.

4)Log4j is implemented for logger to capture the debug console logs and save in src/test/java folder.
(NOT implemented fully).