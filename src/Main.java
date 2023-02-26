public class Main {
    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal1 = ThreadLocal.withInitial(() -> 0);
        ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();

        threadLocal1.set(1);
        threadLocal2.set(1);

        threadLocal1.remove();
        threadLocal2.remove();
        System.out.println(threadLocal1.get());
        System.out.println(threadLocal2.get());
    }
}