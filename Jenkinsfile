pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Prajyot021/ticket-reservation-devops.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t ticket-reservation .'
            }
        }

        stage('Deploy') {
            steps {
                bat 'wsl bash -c "ansible-playbook ansible/deploy.yml"'
            }
        }

    }
}
