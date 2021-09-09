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
              	echo "maven" > build.txt 
              	echo "maven added to build.txt"	
              '''
              echo "maven" > build.txt 
             } else {
              sh '''echo "gradle" > build.txt
              
              echo "gradle added to build.txt"
              '''
              
             }
             
           
          }
        }
        
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'build.txt', fingerprint: true, onlyIfSuccessful: true
            }
        }
      }
  }
