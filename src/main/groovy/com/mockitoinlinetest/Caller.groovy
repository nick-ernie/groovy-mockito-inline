package com.mockitoinlinetest

class Caller {

    private final Called called

    Caller(Called called) {
        this.called = called
    }

    String doCall() {
        this.called.doCall()
    }
}
