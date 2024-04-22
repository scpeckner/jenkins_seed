org = 'scpeckner'
reposToTrack = ['jenkins']
branchToTrack = 'main develop feature* hostfix*'
reposToTrack.each { repo ->
    multibranchPipelineJob(repo+'_multi') {
        branchSources {
            git {
                remote("https://github.com/${org}/${repo}.git")
                credentialsId('scpeckner-up') // If using credentials
                includes(branchToTrack) // Match all branches
                id= org+'_'+repo
            }
        }
    }
}