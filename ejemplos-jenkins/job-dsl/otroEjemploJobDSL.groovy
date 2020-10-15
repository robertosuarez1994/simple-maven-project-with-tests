folder('jobDSL_folder') {
    displayName('jobDSL_folder')
    description('aca vamos a guardar los archivos generados')
}

job('jobDSL_folder/job-prueba') {    
    scm {        
        git('https://github.com/robertosuarez1994/simple-maven-project-with-tests.git')    
    }
    triggers {          
        scm('H/5 * * * *')    
    }                   
    steps {        
        shell 'mvn clean package'
    }
}