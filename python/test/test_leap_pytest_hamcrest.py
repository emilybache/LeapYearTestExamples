from hamcrest import assert_that, equal_to, is_not, is_

from leap import is_leap


def test_common_year():
    assert_that(is_leap(1993), is_not(True))


def test_typical_leap():
    assert_that(is_leap(1992), equal_to(True))


def test_atypical_common():
    assert_that(is_leap(1900), is_not(True))


def test_atypical_leap():
    assert_that(is_leap(1992), is_(True))