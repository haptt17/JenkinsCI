import hudson.plugins.emailext.ExtendedEmailPublisher

def call() {
    emailext body: 'Build Thành Công1', compressLog: true, subject: 'Test', to: 'ha.ptt1707@gmail.com'
}
