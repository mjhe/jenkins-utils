package main.groovy

def checkOutFrom(repo) {
    git url: "git@github.com:mh-1980/${repo}"
}

return this