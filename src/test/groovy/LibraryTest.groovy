/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'ruslanmikhalev' at '1/13/17 11:35 AM' with Gradle 3.2.1
 *
 * @author ruslanmikhalev, @date 1/13/17 11:35 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        when:
        def result = macro {
            println "string"
        }
        then:
        result
    }
}
