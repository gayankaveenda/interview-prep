package com.practice.interviewprep.com.practice.list.singlelinkedlist;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Linked List Test")
public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>();
    }


    @ParameterizedTest
    @NullSource
    @DisplayName("Test Null For Header when list is empty")
    void testPush(Integer number) {
        linkedList.push(number);
        Assertions.assertEquals(null,
                linkedList.getHead());
    }

    @Nested
    class HeadTest {

        @DisplayName("Testing Push")
        @ParameterizedTest(name = "Adding {0} as head.")
        @ValueSource(ints = {3, 5, 8})
        void testPush(Integer number) {
            linkedList.push(number);
            Assertions.assertEquals(number,
                    linkedList.getHead().data);
        }

        @ParameterizedTest
        @NullSource
        @DisplayName("Test Null For Header when has an existing header")
        void testPushForNull(Integer number) {
            linkedList.push(20);
            LinkedList<Integer>.Node<Integer> head = linkedList.getHead();
            linkedList.push(number);
            Assertions.assertEquals(head.data,
                    linkedList.getHead().data);
        }
    }


    @RepeatedTest(10)
    void push(RepetitionInfo repetitionInfo) {
        linkedList.push(repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(repetitionInfo.getCurrentRepetition(),
                linkedList.getHead().data);
    }


    @Nested
    class TailTest {

        @BeforeEach
        void setup() {
            // linkedList = new LinkedList<>();
        }

        @DisplayName("Testing Tail")
        @ParameterizedTest(name = "Adding {0} as tail.")
        @ValueSource(ints = {-1, -4})
        void testPush(Integer number) {
            linkedList.append(number);
            Assertions.assertEquals(number,
                    linkedList.getTail().data);
        }
    }

}