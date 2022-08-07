FROM jenkins/jenkins:2.0.182
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
ENV JAVA_OPTS -Djenkins.install.runSepupWizard=false