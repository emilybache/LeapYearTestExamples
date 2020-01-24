#include "ApprovalTests.hpp"
#include "catch.hpp"
#include <ostream>
#include "leap.h"

using namespace ApprovalTests;


TEST_CASE("Common Year")
{
    REQUIRE_FALSE(isLeap(1993));
}

TEST_CASE("Typical Leap")
{
    REQUIRE(isLeap(1992));
}

TEST_CASE("Atypical common")
{
    REQUIRE_FALSE(isLeap(1900));
}

TEST_CASE("Atypical Leap")
{
    REQUIRE(isLeap(2000));
}
