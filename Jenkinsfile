pipeline {

    agent any

    stages {

        stage('Checkout'){
            steps{
                git 'https://github.com/Prajyot021/ticket-reservation-devops.git'
            }
        }

        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }

        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }

        stage('Docker Build'){
            steps{
                sh 'docker build -t ticket-reservation .'
            }
        }

    }
}
