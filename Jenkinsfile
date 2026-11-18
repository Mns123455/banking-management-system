
pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven'
    }

    stages {

        stage('Git Checkout') {
            steps {
                echo 'Downloading Banking Management System'
                checkout scm
            }
        }

        stage('Maven Build') {
            steps {
                echo 'Building Banking Application'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Maven Test') {
            steps {
                echo 'Running Banking Application Tests'
                bat 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                echo 'Starting SonarQube Code Analysis'

                withSonarQubeEnv('SonarQube') {
                    bat '''
                    mvn sonar:sonar ^
                    -Dsonar.projectKey=banking-management-system ^
                    -Dsonar.projectName=Banking-Management-System
                    '''
                }
            }
        }
    }

    post {
        success {
            echo 'Banking Management System Build Successful!'
        }
    }
}
