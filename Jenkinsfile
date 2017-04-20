node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://deyson12@gitlab.com/deyson12/IntegracionPrueba.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
      scannerHome = tool 'SonarQube Scanner 2.8'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Sonar') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' sonar:sonar"
      } else {
         bat(/"${mvnHome}\bin\mvn" sonar:sonar/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
      echo 'termino de generar el jar'
   }
   stage('Correo'){
      // mail bcc: '', body: 'Hola', cc: 'deyson12@gmail.com', from: '', replyTo: '', subject: 'Hola', to: 'deyson12@gmail.com'
      echo 'Prueba Correo 2'
   }
}
