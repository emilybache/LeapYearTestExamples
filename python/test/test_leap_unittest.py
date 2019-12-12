
import unittest

from leap import is_leap


class LeapYearTest(unittest.TestCase):
    def test_common_year(self):
        self.assertFalse(is_leap(1993))

    def test_typical_leap(self):
        self.assertTrue(is_leap(1992))

    def test_atypical_common(self):
        self.assertFalse(is_leap(1900))

    def test_atypical_leap(self):
        self.assertTrue(is_leap(2000))
