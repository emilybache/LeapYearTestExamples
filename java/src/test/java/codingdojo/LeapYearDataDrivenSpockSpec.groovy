package codingdojo

import spock.lang.Specification

import static codingdojo.LeapYear.isLeap

class LeapYearDataDrivenSpockSpec extends Specification {

    def "leap years"() {
        expect:
        isLeap(year) == expected_value

        where:
        year | expected_value
        1993 | false
        1992 | true
        1900 | false
        2000 | true
    }
}
