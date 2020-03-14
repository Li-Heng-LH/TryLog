# TryLog

### How to make SLF4J 1.8.x work with Log4j 2? ###
* Use Log4j2 version 2.13.1? => This does not work. 
* Use slf4j-log4j12 version 1.8.x, and exclude log4j? => This does not work. Cannot find log4j.level.

&nbsp;

### Naming Loggers ###
* ClassOne.class in `getLogger(ClassOne.class)` will be evaluated to be a String me.liheng.ClassOne.
* This is a useful and straightforward method of defining loggers. 
As the log output bears the name of the generating Logger, this naming strategy makes it easy to identify the origin of a log message.
* In slf4j, Root Logger can be obtained by `LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)`. 

&nbsp;

### Useful Links ###
* [How to configure log4j2 using xml](https://mkyong.com/logging/log4j2-xml-example/)
* [Careful with slf4j-api version 1.8.x](http://www.slf4j.org/codes.html)

