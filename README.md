# TryLog

This is a try out of slf4j with log4j.  
Slf4j version: 1.7.30  
Log4j version: 2.12.1  
Log4j is configured using xml  

&nbsp;

## Learning Notes

### How to make SLF4J 1.8.x work with Log4j 2? ###
* Use Log4j2 version 2.13.1? => This does not work. 
* Use slf4j-log4j12 version 1.8.x, and exclude log4j? => This does not work. Cannot find log4j.level.

&nbsp;

### Logger and LoggerConfig ###
* The Logger itself performs no direct actions. It simply has a name and is associated with a LoggerConfig. 
* LoggerConfig objects are created when Loggers are declared in the logging configuration.
* **A LoggerConfig is configured using the `<Logger>` element. The logger element must have a name attribute specified, will usually have a level attribute specified and may also have an additivity attribute specified.**
* **Creation of Logger:**  Loggers are crested in code using `getLogger`. 
* **Creation of LoggerConfig:** LoggerConfigs are created in xml using `<Logger>`. 

&nbsp;

### Naming Loggers ###
* ClassOne.class in `getLogger(ClassOne.class)` will be evaluated to be a String me.liheng.ClassOne.
* This is a useful and straightforward method of defining loggers. 
As the log output bears the name of the generating Logger, this naming strategy makes it easy to identify the origin of a log message.
* In slf4j, Root Logger can be obtained by `LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)`. 

&nbsp;

### Log Level ###
* Order of significance:  
TRACE < DEBUG < INFO < WARN < ERROR < FATAL
* If LoggerConfig assigned TRACE, only TRACE and above will be logged. 
* If LoggerConfig assigned WARN, only WARN and above will be logged. 
* If LoggerConfig assigned ERROR, only ERROR and above will be logged. 

&nbsp;

### Log Level Inheritance ###
* Log level is defined in LoggerConfig. LoggerConfigs will be assigned a Log Level. 
* If no configuration file found, a ConsoleAppender attached to the root logger, and Level.ERROR is assigned.
* If only the root logger is configured and has a Log Level, all the other Loggers reference the root LoggerConfig and use its Level.
* If Logger ClassOne and ClassTwo have no configured LoggerConfig, they will use the configuration of LoggerConfig me.liheng.
* If LoggerConfig for ClassOne has no configured level, it will **inherit** its level from LoggerConfig me.liheng, which inherits from LoggerConfig me.

&nbsp;

### Appender ###
* An output destination is called an Appender.
* More than one Appender can be attached to a Logger.
* Appenders are inherited additively:  
Each logging request will be forwarded to all the appenders in that Logger's LoggerConfig as well as the Appenders of the LoggerConfig's parents.

&nbsp;


### Layout ### 
* The Layout is responsible for formatting the LogEvent, whereas an appender takes care of sending the formatted output to its destination. 


&nbsp;

### References ###
* [How to configure log4j2 using xml](https://mkyong.com/logging/log4j2-xml-example/)
* [Careful with slf4j-api version 1.8.x](http://www.slf4j.org/codes.html)
* [Log4j2 is not yet compatible with slf4j-api version 1.8.x](https://stackoverflow.com/questions/48829612/using-log4j2-10-and-slf4j-api-1-8-in-osgi-eclipse)
* [log4j 2.x manual](https://logging.apache.org/log4j/2.x/manual/architecture.html)
* [logger vs loggerConfig in log4j2](https://stackoverflow.com/questions/56093098/understanding-the-difference-between-logger-and-loggerconfig-in-log4j2)
* [Configuring Log4j 2](https://logging.apache.org/log4j/2.x/manual/configuration.html)

