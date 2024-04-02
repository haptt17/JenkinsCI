#! /usr/bin/env groovy
import hudson.plugins.emailext.ExtendedEmailPublisher

def call(String body, String subject, String recipientEmail) {
    def email = params.recipientEmail
    emailext body: body, compressLog: true, subject: subject, to: email
}
