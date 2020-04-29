#include "ApprovalTests.hpp"
#include "catch.hpp"
#include <ostream>
#include "leap.h"

using namespace ApprovalTests;

TEST_CASE("Leap with List And Explanations") {
    const auto &years = std::vector<std::tuple<std::string, int>>{
        {"typical common year", 1993},
        {"typical leap year", 1992},
        {"atypical common year", 1900},
        {"atypical leap year", 2000}
    };
    auto result = std::vector<std::tuple<std::string, int, bool>>();
    for (auto data : years) {
        std::string explanation;
        int year;
        std::tie(explanation, year) = data;
        result.push_back({explanation, year, isLeap(year)});
    }
    Approvals::verifyAll("explanation, year -> is leap year", result,
                         [](auto input, auto& stream) {
                             std::string explanation;
                             int year;
                             bool value;
                             std::tie(explanation, year, value) = input;
                             auto true_or_false = value ? "True" : "False";
                             stream << explanation << ", " << year << " -> " << true_or_false;
                         });
}

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
