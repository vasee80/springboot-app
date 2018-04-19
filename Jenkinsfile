node {
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/vasee80/springboot-app.git'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "mvn evosuite:generate -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/mvn evosuite:generate -Dmaven.test.failure.ignore clean package/)
      }
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
   stage('System Test') {
    sh "curl -s -X POST http://bootapp:8080/api/cart/dummy/666/1"
    sh "curl -s http://bootapp:8080/api/cart/dummy | grep 'Dummy Product'"
   }
}
