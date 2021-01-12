#include <gtest/gtest.h>

#include "leap.h"

using namespace std;

TEST(isLeap, Common_Year) {
    ASSERT_FALSE(isLeap(1993));
}

TEST(isLeap, Typical_Leap) {
    ASSERT_TRUE(isLeap(1992));
}

TEST(isLeap, Atypical_common) {
    ASSERT_FALSE(isLeap(1900));
}

TEST(isLeap, Atypical_Leap) {
    ASSERT_TRUE(isLeap(2000));
}
