package designing;

@FunctionalInterface
interface UseInstance<T, X extends Throwable> {
	void accept(T instance) throws X;
}