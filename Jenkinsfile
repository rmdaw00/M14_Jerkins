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
            //if (${params.build == 'maven'}) {
              echo "its maven"
              //  script {
              //  log.info 'Starting even build'
              //  log.warning 'Nothing to do!'
              //}
            //}
          }
        }
      }
  }
