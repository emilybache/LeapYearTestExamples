from leap import is_leap


def test_common_year():
    assert not is_leap(1993)


def test_typical_leap():
    assert is_leap(1992)


def test_atypical_common():
    assert not is_leap(1900)


def test_atypical_leap():
    assert is_leap(2000)