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
            //if (buildNumber % 2 == 0) {
              echo "${params.build}"
              //  script {
              //  log.info 'Starting even build'
              //  log.warning 'Nothing to do!'
              //}
            //}
          }
        }
      }
  }
