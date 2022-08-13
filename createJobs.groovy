pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob("quantum-pay-job"){
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/mkhuselityhobeka/quantum-pay.git'
                    }
                    branch 'develop'
                }

            }
        }
    }
}