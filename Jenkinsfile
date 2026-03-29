pipeline {

    agent any

    environment {
        IMAGE_NAME = "blanck21/ticket-reservation"
        VERSION = "1.0"
    }

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
                sh "docker build -t ${IMAGE_NAME}:${VERSION}.${BUILD_NUMBER} ."
            }
        }

        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(credentialsId: '372a0ec9-98c9-4905-91ca-79149c4ea1bb', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh 'echo $PASS | docker login -u $USER --password-stdin'
                }
            }
        }

        stage('Push Image') {
            steps {
                sh "docker push ${IMAGE_NAME}:${VERSION}.${BUILD_NUMBER}"
            }
        }

        stage('Deploy') {
            steps {
                sh "ansible-playbook -i ansible/inventory ansible/deploy.yml --extra-vars 'image_tag=${VERSION}.${BUILD_NUMBER}'"
            }
        }

    }
}
