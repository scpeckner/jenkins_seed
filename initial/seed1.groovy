
job('seed1'){
    description('seed job')
    concurrentBuild(false)
    scm {
        git {
            remote {
                url('https://github.com/scpeckner/jenkins_seed.git')
                credentials('scpeckner-sp')
            }
            branch('main')

        }
    }
    steps {
        dsl {
            external('jobs/*.groovy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
}