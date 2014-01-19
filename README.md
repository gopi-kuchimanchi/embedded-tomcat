embedded-tomcat
===============

Embed tomcat with Spring mvc annotated service


I have browsed/tried various solutions, examples and blogs - most of them work from within the IDE and very minority of them claimed that their example runs as stand alone jar. In-spite of those examples, I couldn't satisfactorily get any success. So, I have decided to share my working example/project. Hope this helps someone.

This is a quick effort with primary focus to run embed tomcat and deploy a spring services web application (src/test folder and test classes exist only for the sake of maven/war structure completion).

Some highlights...

			Good thing about this approach is that - to create the tomcat instance, there is no need of any custom Main class/method to write.

			Solution uses maven plugin "tomcat7-maven-plugin" to create a jar file with tomcat7 dependencies (org.apache.tomcat.maven.runner.Tomcat7RunnerCli as Main-Class) and this jar file contains war file of the webapp.

			Besides Tomcat7, this example uses: Spring webmvc and annotations. Webapp's web.xml has reference to the Spring Dispatcher servlet and the mvc-dispatcher-context.xml (which performs component scan to find the @Service).

			For the sake of demonstrating a war file with "lib" dependencies, I have created the service as a separate project and added as dependency in the webapp's pom.xml
