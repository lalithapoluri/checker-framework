package java.lang;

import checkers.nonnull.quals.Nullable;


public final class Compiler{
    protected Compiler() {}
    public static native boolean compileClass(Class<?> a1);
    public static native boolean compileClasses(String a1);
    public static native @Nullable Object command(Object a1);
    public static native void enable();
    public static native void disable();
}
