package inplacetestplugin

import inplacetestplugin4.FourthPluginService

class FirstPluginDomain {

    transient fourthPluginService

    static transients = ['someField', 'fourthPluginService']

    static constraints = {
    }

    String getSomeField() {
        println fourthPluginService
        fourthPluginService.serviceMethod()
    }
}
