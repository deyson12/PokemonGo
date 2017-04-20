pipeline {
  agent any
  stages {
    stage('Preparacion') {
      steps {
        echo 'Empezamos con la Configuración'
        git(url: 'https://github.com/deyson12/PokemonGo.git', branch: 'master')
        mail(subject: 'Hola', body: 'Hola', bcc: 'deyson12@gmail.com', cc: 'deyson12@gmail.com', from: 'deyson12@gmail.com', to: 'deyson12@gmail.com', replyTo: 'deyson12@gmail.com')
      }
    }
  }
}