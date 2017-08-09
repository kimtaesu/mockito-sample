package com.hadihariri.mockito.sample.test

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Test


class AnswerTest {

    @Test
    fun answerTest() {
        val list = mock<ArrayList<String>>()

        whenever(list.get(0)).thenAnswer({
            "abc"
        })

        println(list.get(0))
    }
}