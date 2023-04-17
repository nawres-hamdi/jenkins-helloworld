pipeline {
    agent any
    stages {
    stage('clone') {
    steps {
    sh "rm -rf *"
    sh "git clone https://github.com/nawres-hamdi/jenkins-helloworld"
    }
    }
    stage('build') {
    steps {
    sh "cd jenkins-helloworld/ && javac Main.java"
    }
    }
    stage('run') {
    steps {
    sh "cd jenkins-helloworld/ && java Main"
    }
    }
    }
    }
