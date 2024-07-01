# Use an official Tomcat base image with JDK 17
FROM tomcat:9-jdk17-openjdk

# Remove the default webapps to ensure clean deployment
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file to the webapps directory and name it ROOT.war
# This ensures that the application is accessible at the configured context path
COPY target/RentifyServer-1.1.war /usr/local/tomcat/webapps/RentifyServer-1.1.war

# Set environment variables for server port and context path
ENV SERVER_PORT=9999
ENV CONTEXT_PATH=/Rentify

# Expose the specified server port
EXPOSE 9999

# Start Tomcat
CMD ["catalina.sh", "run"]
