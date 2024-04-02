#! /usr/bin/env groovy
import hudson.plugins.emailext.ExtendedEmailPublisher
def call() {
    email='$recipientEmail'
    emailext body: 'Build Thành Công1', compressLog: true, subject: 'Test', to: ${email}
}
