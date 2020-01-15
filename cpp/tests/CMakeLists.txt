set(TEST_NAME Leap.tests)
set(CMAKE_CXX_STANDARD 17)
set(SOURCE_FILES
        main.cpp
        leap_catch.cpp
        )
add_executable(${TEST_NAME} ${SOURCE_FILES})
target_link_libraries(${TEST_NAME} Leap.code Leap.lib)
add_test(NAME ${TEST_NAME} COMMAND ${TEST_NAME})
