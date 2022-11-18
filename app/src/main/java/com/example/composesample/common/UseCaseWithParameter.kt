package com.example.composesample.common

public interface UseCaseWithParameter<P, R> {
    public abstract fun execute(parameter: P): R
}

public interface UseCase<R> {
    public abstract fun execute(): R
}
