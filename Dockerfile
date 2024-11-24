# Base Image
FROM ubuntu

# Do image configuration
RUN /bin/bash -c 'this would generally be a apt-get or other system configuration'
ENV myCustomEnvVar=="This is a sample." \
    otherEnvVar="This is also a sample."