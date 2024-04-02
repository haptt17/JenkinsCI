import hudson.plugins.emailext.ExtendedEmailPublisher

def call(String recipientEmail) {
    def email = recipientEmail
    emailext body: 'Build Thành Công1', compressLog: true, subject: 'Test', to: email
}
