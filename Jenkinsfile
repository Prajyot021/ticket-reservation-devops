pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Prajyot021/ticket-reservation-devops.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t ticket-reservation .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'ansible-playbook ansible/deploy.yml'
            }
        }

    }
}
