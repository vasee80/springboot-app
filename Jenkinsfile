node('maven') {
   stage('Build') {
     git url: "https://github.com/vasee80/springboot-app.git"
     sh "mvn evosuite:generate -Dmaven.test.failure.ignore clean package"
     stash name:"jar", includes:"target/bootapp.jar"
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Build Image') {
    unstash name:"jar"
    sh "oc start-build bootapp --from-file=target/bootapp.jar --follow"
   }
   stage('Deploy') {
    openshiftDeploy depCfg: 'bootapp'
    openshiftVerifyDeployment depCfg: 'bootapp', replicaCount: 1, verifyReplicaCount: true
   }
}
