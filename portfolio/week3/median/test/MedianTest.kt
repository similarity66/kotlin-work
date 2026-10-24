// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            findMedian(listOf())
        }
    }
    "List of size 1 returns that same element" {
        findMedian(listOf(1.0f)) shouldBe (1.0f plusOrMinus tolerance)
    }
    "List of size 2 returns avg of those 2 elements" {
        findMedian(listOf(2.0f, 1.0f)) shouldBe (1.5f plusOrMinus tolerance)
    }
    "Odd size list returns middle value" {
        findMedian(listOf(3.0f, 2.0f, 1.0f)) shouldBe (2f plusOrMinus tolerance)
    }
    "Even size list returns avg of middle 2 values" {
        findMedian(listOf(3.0f, 4.0f, 1.0f, 2.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }
    // Write four more tests here
})
