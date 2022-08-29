pipeline {

    environment {
        registry = "ikaravai/ci-cd-test"
        registryCredential = '1234-5678-90'
        dockerImage = ''
    }

    agent any

//     tools {
//         gradle 'Gradle 7.5.1'
//     }

    stages {
        stage('Cloning our Git') {
            steps {
                git branch: "main", url: 'https://github.com/ikaravai/ci-cd-test.git'
            }
        }

        stage('Gradle Build') {
            steps {
//                 sh 'gradle clean build'
                sh './gradlew build'
            }
        }

        stage('Building our image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }

        stage('Deploy our image') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Cleaning up') {
            steps {
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }
    }
}