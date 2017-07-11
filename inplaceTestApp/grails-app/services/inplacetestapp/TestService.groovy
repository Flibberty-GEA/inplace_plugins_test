package inplacetestapp

import grails.transaction.Transactional

@Transactional
class TestService {

    String serviceMethod() {
        "TestService.serviceMethod"
    }
}
