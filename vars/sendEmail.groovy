#! /usr/bin/env groovy
import hudson.plugins.emailext.ExtendedEmailPublisher

def call(String recipientEmail) {
    def email = params.recipientEmail
    emailext body: 'Build Thành Công1', compressLog: true, subject: 'Test', to: email
}
