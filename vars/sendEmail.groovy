#! /usr/bin/env groovy
import hudson.plugins.emailext.ExtendedEmailPublisher

def call(String body, String subject, String recipientEmail,) {
    def email = params.recipientEmail
    body = body // User input for body
    subject = subject // User input for subject
    emailext body: body, compressLog: true, subject: subject, to: email
}
