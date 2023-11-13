
# OnlineStudeyHelpBD-A-SpringBoot-Project

**This is a Spring Boot Learning project**

**OnlineStudyHelpBD**

```
OnlineStudyHelpBD is a website where students can ask their subjectwise most difficult questions.
```

# Project Description



# Technology Used
My project relies on the following technologies, libraries, and tools:



### Backend
- [![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?&style=for-the-badge&logo=java&logoColor=white)](https://www.java.com): The core programming language.
- [![Spring Framework](https://img.shields.io/badge/Spring_Framework-%236DB33F.svg?&style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-framework): A comprehensive framework for Java development.
- [![Spring Boot](https://img.shields.io/badge/Spring_Boot-%236DB33F.svg?&style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot): A project within the Spring ecosystem, simplifying the setup and development of Spring applications.

### Build Tools
- [![Maven](https://img.shields.io/badge/Maven-%23C71A36.svg?&style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org): A popular build automation and project management tool.

### Web Server
- [![Apache Tomcat](https://img.shields.io/badge/Apache_Tomcat-%23F8DC75.svg?&style=for-the-badge&logo=apache-tomcat&logoColor=black)](http://tomcat.apache.org): A widely used web server and servlet container.

### Database
- [![MySQL](https://img.shields.io/badge/MySQL-%234479A1.svg?&style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com): A robust relational database management system.

### Version Control
- [![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com): A web-based platform for version control using Git.

### Integrated Development Environment (IDE)
- [![VS Code](https://img.shields.io/badge/VS_Code-%23007ACC.svg?&style=for-the-badge&logo=visual-studio-code&logoColor=white)](https://code.visualstudio.com): A lightweight and powerful source code editor.

### Frontend Technologies
- [![HTML](https://img.shields.io/badge/HTML-%23E44D26.svg?&style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/HTML): Markup language for creating the structure of web pages.
- [![CSS](https://img.shields.io/badge/CSS-%231572B6.svg?&style=for-the-badge&logo=css3&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/CSS): Stylesheet language for designing the presentation of web pages.
- [![JavaScript](https://img.shields.io/badge/JavaScript-%23F7DF1E.svg?&style=for-the-badge&logo=javascript&logoColor=black)](https://developer.mozilla.org/en-US/docs/Web/JavaScript): Programming language for adding interactivity to web pages.

### Java Web Technologies
- [![Spring MVC](https://img.shields.io/badge/Spring_MVC-%236DB33F.svg?&style=for-the-badge&logo=spring&logoColor=white)](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html): A web module of the Spring Framework for building web applications.
- [![RESTful APIs](https://img.shields.io/badge/RESTful_APIs-%231572B6.svg?&style=for-the-badge&logo=rest&logoColor=white)](https://restfulapi.net): Architectural style for creating web services, implemented using Java.

### Java Database Connectivity (JDBC)
- [![JDBC](https://img.shields.io/badge/JDBC-%23EA5E00.svg?&style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/package-summary.html): Utilized for connecting Java applications to the MySQL database.





# Home Page
<img src="Home Page-1.gif" width="500" height="267">                <img src="Home Page-2.gif" width="500" height="267">

```
Home page before and after login
```

# All Questions Page 

<img src="AllQuestions.gif">

```
By clicking on a subject studens or Admin can enter all the available questions
of this subject
```

# Ask A Quesion

<img src="AskAQuestion.gif">

```
Student can ask questions which they felt are very difficult to answer
```
# Student Login
<img src="student login.PNG" width="708" height="378">

# Admin Login
<img src="admin login.PNG" width="708" height="378">


# Spring boot Learning notes
```
**As it was mentioned earlier this was a spring boot learning project**
```


## Spring boot Project Structures


1. **src/main/java**: This directory contains your main Java source code.

   - **com.example.demo**: This is often the package structure for your project. The package name is usually in reverse domain format. For example, if your domain is example.com, your package might be com.example.

     - **Application.java**: This is the entry point of your Spring Boot application. It contains the `main` method and is annotated with `@SpringBootApplication`, which is a convenience annotation that adds various configuration classes.

2. **src/main/resources**: This directory contains non-Java resources, such as application properties, XML configuration files, static content, templates, etc.

   - **application.properties or application.yml**: Configuration files where you can set various properties for your application, like server port, database connection details, etc.

   - **static/**: This directory is used for static resources such as CSS, JavaScript, images, etc.

   - **templates/**: This directory is used for HTML templates if you are using a template engine like Thymeleaf.

3. **src/test**: This directory contains your test code.

   - **com.example.demo**: This mirrors the structure of the main source code, and you will find test classes here to test your application.

4. **pom.xml (Maven)** or **build.gradle (Gradle)**: This is the project configuration file where you specify dependencies, plugins, and other build-related settings.

5. **target (or build) directory**: This is the default output directory for compiled classes and generated JAR or WAR files.

6. **mvnw and mvnw.cmd (or gradlew and gradlew.bat)**: These are wrapper scripts for Maven or Gradle, respectively. They allow you to run your project without having to install Maven or Gradle separately.

7. **.gitignore**: This file specifies intentionally untracked files that Git should ignore.

8. **README.md**: A markdown file providing information about the project, including instructions for building and running it.

9. **.editorconfig**: A configuration file to define and maintain consistent coding styles between different editors and IDEs.

10. **.git**: The directory that contains the configuration, objects, and refs for a Git repository.

11. **.mvn**: Maven wrapper directory, contains wrapper files for Maven similar to the mvnw script.

12. **.settings**: IDE-specific settings, e.g., for Eclipse.

Remember that the structure can vary based on your specific requirements, and additional directories may be present based on the complexity and needs of your project. Also, the actual file names and contents may vary based on the tools and libraries you are using.


## My Spring boot Project Structures



```plaintext
src
|-- main
|   |-- java
|   |   `-- com
|   |       `-- example
|   |           `-- OnlineStudyHelp
|   |               |-- controller
|   |               |   |-- Controllers.java
|   |               |-- model
|   |               |   |-- Questions.java
|   |               |   |-- Subjectadded.java
|   |               |   |-- Loginadmin.java
|   |               |   |-- LoginUser.java
|   |               |-- repository
|   |               |   |-- LoginadminRepository.java
|   |               |   |-- LoginUserRepository.java
|   |               |   |-- QuestionsRepository.java
|   |               |   |-- SubjectaddedRepository.java
|   |               |-- service
|   |               |   |-- LoginadminService.java
|   |               |   |-- LoginUserService.java
|   |               |   |-- QuestionsService.java
|   |               |   |-- SubjectaddedService.java
|   |               |-- utility
|   |               |   |-- Confirmation.java
|   |               |   |-- Person.java
|   |               |   |-- QuestionRequest.java
|   |               |-- OnlineStudyApplication.java
|   |
|   |-- resources
|   |   |-- application.properties (Contains database connections)
|   |   |-- static
|   |   |   |-- css
|   |   |   |   `-- style.css
|   |   |   |-- js
|   |   |   |   `-- script.js
|   |   |   `-- images
|   |   |       `-- logo.png
|   |   |
|   |   |-- templates
|   |   |   `-- index.html
|   |   |   `-- other html files
|   `-- webapp (optional)
|       `-- WEB-INF
|
|-- test
|   |-- java
|   |   `-- com
|   |       `-- example
|   |           `-- myproject
|   |               |-- controller
|   |               |   `-- MyControllerTest.java
|   |               |-- service
|   |               |   `-- MyServiceTest.java
|   |               `-- MyProjectApplicationTests.java
|
`-- target
```


















