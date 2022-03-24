@Library('mysharedlib1')_
pipeline {
    agent any
    stages {
        stage('new') {
            steps {
                git 'https://github.com/opstree/spring3hibernate'
            }
        }
        stage("code stability") {
            steps{
                first('compile')
            }
        }
    }
}
