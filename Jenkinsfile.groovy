
pipeline {
    agent {
        dockerfile true
    }
    //continue here https://www.youtube.com/watch?v=Pi2kJ2RJS50&t=26s at 1:28 
    
    stages {
        stage('Build') {
            steps {
                echo 'Hello, World!'
                // Add build commands here
                sh 'echo myCustomEnvVar=$myCustomEnvVar'
                sh 'echo otherEnvVar=$otherEnvVar'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here 
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment commands here
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline execution failed!'
        }
    }
}

