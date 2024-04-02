import hudson.plugins.emailext.ExtendedEmailPublisher
def call() {
    emailext body: 'Build Thành Công1', compressLog: true, subject: 'Test', to: ${email}
}
