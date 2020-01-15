package codingdojo

import spock.lang.Specification

import static codingdojo.LeapYear.isLeap

class LeapYearSpockSpec extends Specification {
    def "common year"() {
        expect:
        !isLeap(1993)
    }

    def "typical leap"() {
        expect:
        isLeap(1992)
    }

    def "atypical common"() {
        expect:
        !isLeap(1900)
    }

    def "atypical leap"() {
        expect:
        isLeap(2000)
    }
}
