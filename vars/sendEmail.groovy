import hudson.plugins.emailext.ExtendedEmailPublisher

def sendEmail(String subject, String mimeType = 'text/plain', boolean attachLog = false) {
    emailext subject: subject,
             to: ${params.recipientEmail},
             mimeType: mimeType,
             attachLog: attachLog
}
