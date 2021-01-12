cmake_minimum_required(VERSION 3.16)
set(CMAKE_VERBOSE_MAKEFILE ON)
project(LeapYearTestExamples VERSION 1.0
        DESCRIPTION "Sample tests for LeapYear in various testing styles and frameworks"
        LANGUAGES CXX)

# uncomment these lines to enable coverage measurements using gcov
#set(CMAKE_CXX_FLAGS "--coverage")

enable_testing()
add_subdirectory(src)
add_subdirectory(test-catch2)
add_subdirectory(test-gtest)

