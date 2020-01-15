#include "ApprovalTests.hpp"
#include "catch.hpp"
#include <ostream>
#include "leap.h"

using namespace ApprovalTests;

TEST_CASE("DemoSimpleTestCase")
{
    Approvals::verify("Some\nMulti-line\noutput");
}

struct Demo
{
    int value1;
    int value2;

    friend std::ostream& operator<<(std::ostream& os, const Demo& obj)
    {
        return os
            << "value1: " << obj.value1
            << ", value2: " << obj.value2;
    }
};

TEST_CASE("DemoCombinationTestCase")
{
    std::vector<int> evens{ 2, 4, 6, 8, 10 };
    std::vector<int> odds{ 1, 3, 5, 7, 9 };
    CombinationApprovals::verifyAllCombinations(
            [](int i, int j) { return Demo{ i, j }; },
            evens, odds);
}

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

TEST_CASE("Leap with List")
{
    auto result = std::vector<std::string>();
    const auto &years = std::vector<int>{1993, 1992, 1900, 2000};
    for (auto year : years)
    {
        std::stringstream buffer;
        buffer << year << " -> " << isLeap(year);
        result.push_back(buffer.str());
    }
    Approvals::verifyAll("Year -> is leap year", result);
}

