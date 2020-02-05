using System;
using System.Collections.Generic;
using System.Text;
using Xunit;

namespace LeapYearTestExamples
{
    public class LeapYearXUnitTest
    {
        [Fact]
        public void CommonYear()
        {
            Assert.False(LeapYear.IsLeap(1993));
        }
        
        [Fact]
        public void TypicalLeap()
        {
            Assert.True(LeapYear.IsLeap(1992));
        }
        
        [Fact]
        public void AtypicalCommonYear()
        {
            Assert.False(LeapYear.IsLeap(1900));
        }
        
        [Fact]
        public void AtypicalLeap()
        {
            Assert.True(LeapYear.IsLeap(2000));
        }
    }
}
