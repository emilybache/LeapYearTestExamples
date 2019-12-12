"""See https://behave.readthedocs.io/en/latest/

To run these tests, first install 'behave'.
In the project folder (one above this one) run:

  behave

You should see output that includes this:

    1 feature passed, 0 failed, 0 skipped
    5 scenarios passed, 0 failed, 0 skipped
    14 steps passed, 0 failed, 0 skipped, 0 undefined
"""

import os

from behave import when, then, given

import sys
sys.path.insert(0, os.getcwd())

from leap import is_leap


@when("I have the year {year}")
def step_impl(context, year):
    context.year = int(year)


@then("it is not a leap year")
def step_impl(context):
    assert not is_leap(context.year)


@then("it is a leap year")
def step_impl(context):
    assert is_leap(context.year)


@when("I calculate whether it is a leap year")
def step_impl(context):
    context.is_leap = str(is_leap(context.year))


@then("it should be {result}")
def step_impl(context, result):
    assert context.is_leap == result


@given("I have the year {year}")
def step_impl(context, year):
    context.year = int(year)
