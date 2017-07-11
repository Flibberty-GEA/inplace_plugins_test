package inplacetestapp

//import inplacetestplugin.FirstPluginDomain

class MainController {

    def index() {
        TestDomain domain = new TestDomain()
        TestDomain domain2 = new TestDomain()
        TestDomain domain3 = new TestDomain()
        TestDomain domain4 = new TestDomain()
        TestDomain domain5 = new TestDomain()
        TestDomain domain6 = new TestDomain()
        TestDomain domain7 = new TestDomain()
        TestDomain domain8 = new TestDomain()
        TestDomain domain9 = new TestDomain()

        render """
        ${domain.getSomeField()};
        ${domain2.getSomeField()};
        ${domain3.getSomeField()};
        ${domain4.getSomeField()};
        ${domain5.getSomeField()};
        ${domain6.getSomeField()};
        ${domain7.getSomeField()};
        ${domain8.getSomeField()};
        ${domain9.getSomeField()};
        """
    }
}
