#include "ApprovalTests.hpp"
#include "catch.hpp"
#include <ostream>
#include "leap.h"

using namespace ApprovalTests;

TEST_CASE("Leap with List") {
    auto result = std::vector<std::string>();
    const auto &years = std::vector<int>{1993, 1992, 1900, 2000};
    for (auto year : years) {
        std::stringstream buffer;
        auto true_or_false = isLeap(year) ? "True" : "False";
        buffer << year << " -> " << true_or_false;
        result.push_back(buffer.str());
    }
    Approvals::verifyAll("Year -> is leap year", result);
}


TEST_CASE("Leap with Combinations") {
    const auto &years = std::vector<int>{1993, 1992, 1900, 2000};
    CombinationApprovals::verifyAllCombinations(
            [](int year) { return isLeap(year) ? "True" : "False"; },
            years);
}
