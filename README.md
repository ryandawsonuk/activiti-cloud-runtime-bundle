# activiti-cloud-runtime-bundle

Runtime bundle based on runtime bundle starter

Here the path to process definitions (as xml files) defaults to /processes/ on the docker container or can be set in the ACT_RB_PROCESSES_PATH environment variable. This environment variable is referenced in the properties file. To run the docker container, it is also necessary to set the environment variable in the docker run command to the path to processes within the docker container. The path to processes can be set up as a volume linked to a host directory that contains the xml files. Some process definition must be made available or startup will fail.

The application.properties assumes a postgres server called rb-postgres (or being reachable on that docker name if running in container). This is for use in a sample activiti project. It can be overridden with an env variable. The test instead uses h2. Other db driver dependencies are excluded in pom - modify pom as needed or re-include jars via docker by copying to dir ref by loader.path.