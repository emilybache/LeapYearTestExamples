

#include "leap.h"

bool isLeap(int y) {
    if (y % 400 == 0) {
        return true;
    }
    if (y % 100 == 0) {
        return false;
    }
    return y % 4 == 0;
}

