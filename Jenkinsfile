pipeline {
  agent any
  stages {
    stage('Preparacion') {
      steps {
        echo 'Empezamos con la Configuración'
        git(url: 'https://github.com/deyson12/PokemonGo.git', branch: 'master')
      }
    }
  }
}