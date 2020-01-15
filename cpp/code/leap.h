#ifndef APPROVALTESTS_CPP_STARTERPROJECT_LEAP_H
#define APPROVALTESTS_CPP_STARTERPROJECT_LEAP_H

bool isLeap(int y){
    if (y % 400 == 0)
    {
        return true;
    }
    if (y % 100 == 0)
    {
        return false;
    }
    return y % 4 == 0;
}


#endif //APPROVALTESTS_CPP_STARTERPROJECT_LEAP_H
