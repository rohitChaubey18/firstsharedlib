def call(){
    checkout scm
    config = readProperties file: "configuration"
    git branch: "${config.git_branch}, url: "${config.git_url}"
}
