@echo on

@FOR /f "delims=" %%i in ('chdir') DO set APP_HOME=%%i
echo "Current Directory %APP_HOME%"

set GC_MAX_METASPACE_SIZE=1024
set GC_METASPACE_SIZE=384
set MAVEN_OPTS="-Xms4G -Xmx10G -XX:MetaspaceSize=384M -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true"
set MAVEN_OPTS="%MAVEN_OPTS% -Djava.awt.headless=true -XX:+CompactStrings"
echo %MAVEN_OPTS%

%APP_HOME%\mvnw clean wildfly-jar:dev-watch