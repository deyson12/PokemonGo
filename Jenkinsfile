pipeline {
  agent any
  stages {
    stage('Preparacion') {
      steps {
        echo 'Empezamos con la Configuración'
        git(url: 'https://github.com/deyson12/PokemonGo.git', branch: 'master')
        echo 'Ya se hizo el Checkout'
        mvnHome = tool 'M3'
      }
    }
    stage('Build') {
      steps {
        bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
    }
  }
}
