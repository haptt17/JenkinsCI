import hudson.plugins.emailext.ExtendedEmailPublisher
def email= params.recipientEmail
def call() {
    emailext body: 'Build Thành Công1', compressLog: true, subject: 'Test', to: ${email}
}
