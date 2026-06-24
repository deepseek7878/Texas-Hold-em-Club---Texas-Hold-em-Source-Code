#pragma once

#include <random>
#include <algorithm>

#include "common/nndef.h"

using namespace nndef;
using namespace nncard;
using namespace nninvalid;

namespace nnlogic
{
    extern const short CONST_CARD_NUM;

    int nnrand(int max, int min = 0);
    void build(vecc_t &vSrcCards);

    template<typename T>
    void shuffle(std::vector<T> &vSrc)
    {
        std::random_device rd;
        std::mt19937 g(rd());
        std::shuffle(vSrc.begin(), vSrc.end(), g);
    }

    void deal(vecc_t &vSrcCards, vecc_t &vDstCards, int iNum);
    int getbombnum(const std::map<card_t, short> &mCardCount);
    bool issamekind(const vecc_t &vSrcCards);
    bool isstraight(const vecc_t &vNumCards, const std::map<card_t, short> &mCardCount, int space);
    bool isstraightflush(std::map<card_t, short>& mCardCount, vecc_t& vTempCarsd);
    E_NN_TYPE getnn(const vecc_t &vSrcCards);
    std::map<card_t, short> nncard2cardcount(const vecc_t &vSrcCards);
    vecc_t nncard2cardnum(const vecc_t &vSrcCards);

    bool compare(const vecc_t &vSrcCards1, const vecc_t &vSrcCards2);
    bool compare(const vecc_t &vSrcCards1, const vecc_t &vSrcCards2, E_NN_TYPE nntype);

    void sortCard(vecc_t &vTempCarsd);

    bool compare_0p(const vecc_t &vSrcCards1, const vecc_t &vSrcCards2);
    bool compare_1p(std::map<card_t, short> mCardCount1, std::map<card_t, short> mCardCount2, vecc_t &vTempCarsd1, vecc_t &vTempCarsd2);
    bool compare_2p(std::map<card_t, short> mCardCount1, std::map<card_t, short> mCardCount2, vecc_t &vTempCarsd1, vecc_t &vTempCarsd2);
    void vecremove(vecc_t &vSrcCards1, vecc_t &vSrcCards2);
    void vecremove2(vecc_t &vSrcCards, card_t face);

    bool checkcard(short card_num);

    card_t BestCardStraight(std::map<card_t, short>& mCardCount, const vecc_t &vHallCards, int suit);
    void BestCards(const vecc_t &vSrcCards, const vecc_t &vHallCards, vecc_t &vDesCards);
    
    template<typename T>
    bool vecfind(std::vector<T> const &vecSrc, T t)
    {
        typename std::vector<T>::const_iterator it = std::find(vecSrc.begin(), vecSrc.end(), t);
        return it != vecSrc.end();
    }

    template<typename T>
    bool vecfind(std::vector<T> const &vecSrc1, std::vector<T> const &vecSrc2)
    {
        for(typename std::vector<T>::const_iterator it = vecSrc2.begin();  it != vecSrc2.end(); it++)
        {
            if(!vecfind<T>(vecSrc1, *it))
            {
                return false;
            }
        }

        return true;
    }

    template<typename T>
    bool vecfind(std::vector<std::vector<T> > const &vecSrc1, std::vector<T> const &vecSrc2)
    {
        for (typename std::vector<std::vector<T> >::const_iterator it = vecSrc1.begin(); it != vecSrc1.end(); it++)
        {
            if(vecfind<T>(*it, vecSrc2))
            {
                return true;
            }
        }

        return false;
    }
};