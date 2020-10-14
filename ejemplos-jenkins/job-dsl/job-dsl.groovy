job_name = "ejemplo-pipeline-job-dsl"

job_name_2 = "otro-pipeline-job-dsl"

pipelineJob(job_name) {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline-ejemplo.groovy'))
        }
    }
}


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
            scriptPath('ejemplos-jenkins/job-dsl/pipeline-ejemplo.groovy')
        }
    }
}