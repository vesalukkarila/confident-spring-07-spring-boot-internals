# confident-spring-07-spring-boot-internals
This repository is related to module 7 in Marco Behler's course "The confident Spring professional" https://www.marcobehler.com/ which I purchased in order  to understand the fundamentals of Spring.  
The course starts with plain Java backend and introduces plain Spring features little by little, showcasing what Spring Boot hides under the hood. At the end of the course Spring Boot features are implemented.  

## Learning goals
Short but intensive module. To be revisited later. 
- AutoConfigurations
- Inspecting Spring Boot's original source code.
- Building own AutoConfiguration to understand how AutoConfiguration works.

## Key takeaways
- AutoConfiguration is normal Spring configuration but with a ton of @Conditionals.
- If those @Conditionals match, the autoconfigurations are evaluated and beans are automatically created.
- Leads to a lot of functionalility out of the box, when a new Spring Boot project is created.  
