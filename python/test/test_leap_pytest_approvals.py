import pytest
from approvaltests import verify_all_combinations, verify_all, verify, get_scenario_namer

from leap import is_leap


def test_leap_with_combinations():
    verify_all_combinations(is_leap, [[1993, 1992, 1900, 2000]])


def test_leap_with_list():
    results = [(year, is_leap(year)) for year in [1993, 1992, 1900, 2000]]
    verify_all("(year, is leap year)", results)


@pytest.mark.parametrize("year", [1993, 1992, 1900, 2000])
def test_scenarios(year):
    verify("is Leap " + str(year) + ": " + str(is_leap(year)), namer=get_scenario_namer(year))
