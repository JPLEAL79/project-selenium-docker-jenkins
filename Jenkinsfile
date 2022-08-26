 pipeline {
 agent any

 tools {
         maven 'maven3.8.6'
         jdk 'jdk8'
     }

     stages{
         stage('download source code'){
             steps{
              echo 'download source...'
              git credentialsId: 'jpleal' , url: 'https://github.com/JPLEAL79/project-selenium-docker-jenkins.git'

             }
         }

         stage('Clean'){
             steps{
             echo 'clean project...'
             sh 'mvn -f pom.xml clean'

             }
         }
     }
 }