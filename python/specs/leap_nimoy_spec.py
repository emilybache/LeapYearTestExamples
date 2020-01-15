"""see https://github.com/browncoat-ninjas/nimoy

To run these tests, first install nimoy:

    pip install nimoy-framework

Then open a terminal in the project directory (the one above this one)
and run nimoy:

    > nimoy

You should see output like this:

    is_leap (builtins.LeapYearDataSpec) ... ok
    common_year (builtins.LeapYearSpec) ... ok
    typical_leap (builtins.LeapYearSpec) ... ok
    atypical_common (builtins.LeapYearSpec) ... ok
    atypical_leap (builtins.LeapYearSpec) ... ok

    ----------------------------------------------------------------------
    Ran 5 tests in 0.001s

    OK
"""
import os

from nimoy.specification import Specification

import sys
sys.path.insert(0, os.getcwd())

from leap import is_leap


class LeapYearDataSpec(Specification):
    def is_leap(self):
        with expect:
            is_leap(year) == expected_value

        with where:
            year | expected_value
            1993 | False
            1992 | True
            1900 | False
            2000 | True


class LeapYearSpec(Specification):
    def common_year(self):
        with when:
            result = is_leap(1993)
        with then:
            result == False

    def typical_leap(self):
        with when:
            result = is_leap(1992)
        with then:
            result == True

    def atypical_common(self):
        with when:
            result = is_leap(1900)
        with then:
            result == False

    def atypical_leap(self):
        with when:
            result = is_leap(2000)
        with then:
            result == True


