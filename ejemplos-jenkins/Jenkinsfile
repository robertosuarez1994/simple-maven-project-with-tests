pipeline {
    agent any

    stages {
        stage('pull repository') {
            steps {
                echo '****haciendo pull de nuestro repositorio*****'
                git 'https://github.com/robertosuarez1994/simple-maven-project-with-tests.git'
            }
        }
        stage('build') {
            steps {
                echo '****haciendo el build de nuestro repositorio*****'
                sh 'mvn clean package'
            }
        }
    }
}