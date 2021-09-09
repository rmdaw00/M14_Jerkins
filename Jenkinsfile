// Jenkinsfile
//@Library('mavenBuild') _
//@Library('gradleBuild') _



pipeline {
      agent any

      parameters {
        string(name: 'build', defaultValue: 'maven', description: 'Choose the build type to use (\'maven\' or \'gradle\'')
      }

      stages {
        stage('Staging') {
          steps {
            if (${params.build == 'maven'}) {
              sh '''
              	mvn install
              '''
              echo "its maven"
             } else {
              echo "its not maven"
             }
          }
        }
      }
  }
