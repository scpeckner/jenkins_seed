org = 'scpeckner'
repoToTrack = 'jenkins'

multibranchPipelineJob('multi1') {
    branchSources {
        git {
          remote("https://github.com/${org}/${repoToTrack}.git")
            credentialsId('scpeckner-up') // If using credentials
            includes('*') // Match all branches
            id= org+'_'+repoToTrack

        }
    }

}