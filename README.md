Installations Steps

1. Download  JDK java version 1.8.0_171 https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html (it is the first one when you navigate to the page "Java SE Development Kit 8u201")
2. Set your Environment for java
3. Download Apache-maven 3.6.0 https://maven.apache.org/download.cgi (it is the binary zip link look something like this apache-maven-3.6.0-bin.zip) (set your environment for maven for windows, mac should be fine without setting it) "https://www.youtube.com/watch?v=oTRmukUvB50"

3.5 Mac users can just type brew install maven

4. Download Eclipse Java EE IDE for Web Developers https://www.eclipse.org/oxygen/ (must have java before downloading Eclipse)

5. Go to market place in your eclipse under Help module

6. Type in Cucumber and install Cucumber Eclipse plugin

7. cd [where you want your project]

8. git clone https://github.com/tarkiksolutions/manifest-truck-trade-testing.git

7. Then load existing project into eclipse



Steps for people running on MAC operating Systems
1. Download the latest ChromeDriver https://sites.google.com/a/chromium.org/chromedriver/downloads download mac64
2. Once downloaded drag and drop chromedriver onto desktop and create a folder for Driver and place chromedriver in folder
3. Right click on Chromedriver location and copy location of the directory
4. Then go to eclipse expand project expand src/test/java 
4. Expand basePackage
5. Double click BaseClass.java
6. Scroll until you see setUp() method, and within System.setProperty replace the path of existing path of driver to current path of driver
7. Make sure that you don't add the .exe for chromedriver "YourPathtoDriverFolder\chromedriver" 
8. Next go to your pom.xml located within your project level folder
9. scroll down close to the end where you'll see plugin's for maven-compiler-plugin delete the path of my java
<fork>true</fork>
<executable>C:\Program Files\Java\jdk\bin\javac.exe</executable> 

How to run project through command line
1. make sure you "ng serve --open" Stevens project <---do not need quotations when pasting
2. open a new terminal(command prompt) do not close terminal of where you did step 1
2. cd "path of maven test folder" <---do not need quotations when pasting
3. then type "mvn clean verify test" <---do not need quotations when pasting or typing
4. after type "mvn serenity:aggregate" <---do not need quotations when pasting or typing

How to run within Eclipse through POM.xml
1. Click onto POM.xml(you will see pom.xml if you expand the project folder)
2. Then within the tabs that will be available click on pom.xml again
3. Right click 
4. Scroll to "Run As"
5. mvn clean
6. mvn install
7. mvn test


How to run off Class Level
1. Open Project
2. Expand src/test/java
3. Expand runnerPackage
4. Click on Runner class
5. Right click and "Run As" Junit

Report Location and How to Display Report
//Precondition must run the mvn commands on terminal(command prompt) for report to generate
1. After you run the mvn commands right click on project folder click on refresh
2. Expand project in eclipse
3. Expand target folder
4. Expand site folder
5. Expand serenity folder
6. Scroll until you see index.html
7. Right click index.html 
8. Click on properties
9. Copy the whole location //example "C:\Users\Uncleared\Desktop\com.cbp.truck.tradeportal\target\site\serenity\index.html"
10. Paste path unto URL on any browser and report will display

Note: The test result won't generate unless you run through command line, but test will run
	  if you run on class level.
FYI this is a mockup run not the actual project i will be automating Stevens work this sprint