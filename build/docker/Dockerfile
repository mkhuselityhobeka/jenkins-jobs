FROM jenkins/jenkins:lts-jdk11

USER root
RUN curl -sSL https://get.docker.com/ | sh
RUN  usermod -a -G docker jenkins
RUN chmod 777 /var/run/docker.sock
USER jenkins

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt
COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false