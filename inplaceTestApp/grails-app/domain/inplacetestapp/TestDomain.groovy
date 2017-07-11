package inplacetestapp

import inplacetestplugin4.FourthPluginService

class TestDomain implements Serializable {

    TestService testService
    FourthPluginService fourthPluginService

    static transients = ['someField', 'testService', 'fourthPluginService']
//    static transients = ['someField']

    static constraints = {
    }

    String getSomeField() {
//        "TestDomain.getSomeField"
        "${testService.serviceMethod()} -- ${fourthPluginService.serviceMethod()}"
    }
}
