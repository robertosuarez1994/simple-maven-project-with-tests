job_name = "ejemplo-pipeline-job-dsl"

job_name_2 = "otro-pipeline-job-dsl"

//pipelineJob(job_name) {
//    definition {
//        cps {
//            script(readFileFromWorkspace('pipeline-ejemplo.groovy'))
//        }
//    }
//}

//prueba

//pipelineJob(job_name_2) {
//    definition {
//        cpsScm {
//            scm{
//                git{
//                    branch('*/master')
/*                    remote{
                        url('https://github.com/robertosuarez1994/simple-maven-project-with-tests.git')
                    }
                }
                
            }
            script(readFileFromWorkspace('ejemplos-jenkins/job-dsl/pipeline-ejemplo.groovy'))
        }
    }
}*/

pipelineJob(job_name_2) {
    definition {
        cpsScm {
            scm{
                git{
                    branch('*/master')
                    remote{
                        url('https://github.com/robertosuarez1994/simple-maven-project-with-tests.git')
                    }
                }
                
            }
            stage('pull repository') {
                steps {
                    echo '****haciendo pull de nuestro repositorio*****'
                    git 'https://github.com/robertosuarez1994/simple-maven-project-with-tests.git'
                }
            }
            stage('build') {
                steps {
                    echo '****haciendo el build de nuestro repositorio*****'
                    sh 'mvn clean package'
                }
            }
        }
    }
}