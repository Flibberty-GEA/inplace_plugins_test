package inplacetestplugin4

import grails.transaction.Transactional

@Transactional
class FourthPluginService {

    String serviceMethod() {
        println "FourthPluginService"
        "FourthPluginService"
    }
}
