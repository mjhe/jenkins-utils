package main.groovy

def call(Map config) {
    node {
        git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
        sh 'mvn install'
        mail to: '...', subject: "${config.name} plugin build", body: '...'
    }
}

def checkOutFrom(repo) {
    git url: "git@github.com:mh-1980/${repo}"
}

return this