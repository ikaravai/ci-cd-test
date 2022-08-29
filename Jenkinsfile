pipeline {

    environment {

        registry = "ikaravai/ci-cd-test"

        registryCredential = '1234-5678-90'

        dockerImage = ''

    }

    agent any

    stages {

        stage('Cloning our Git') {

            steps {

                git branch: "main", url: 'https://github.com/ikaravai/ci-cd-test.git'

            }

        }

        stage('Gradle Build') {

            steps {

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