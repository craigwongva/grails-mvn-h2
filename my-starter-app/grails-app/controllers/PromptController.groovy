import groovy.json.*
import java.sql.*

class PromptController {

    Connection conn
    def jsonSlurper

    PromptController() {
        Class.forName("org.h2.Driver");
        conn = DriverManager.
            getConnection("jdbc:h2:tcp://localhost/~/univision", "sa", "");
            //getConnection("jdbc:h2:~/test", "sa", "");
            //getConnection("jdbc:h2:mem:test", "sa", "");
        jsonSlurper = new JsonSlurper()
    }
}
