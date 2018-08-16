总结：
多线程开发中应该优先使用高层API，如CompletableFuture， 轻量级任务执行框架fork/join
如果无法满足，使用 java.util.concurrent.atomic和java.util.concurrent.locks包提供的中层API，
而 synchronized和volatile，以及wait,notify和notifyAll等低层API 应该最后考虑。