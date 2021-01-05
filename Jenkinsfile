pipeline {
    agent {
        steps {
            echo "Hello World!"
            sh "hostname"
            sh "uptime"
                docker {
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}