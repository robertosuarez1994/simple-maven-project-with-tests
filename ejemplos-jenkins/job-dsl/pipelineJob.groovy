pipelineJob('pipelineJobGenerate') {
    definition {
        cpsScm {
            scm{
                git{
                    remote{
                    	url('https://github.com/robertosuarez1994/simple-maven-project-with-tests.git')
                    }
                }
            }  
            scriptPath('ejemplos-jenkins\job-dsl\pipelineMVN.groovy')
        }
    }
}