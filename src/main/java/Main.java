
import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Other.saySomthing();

        Some some = new Some(" ");
        System.out.println(some.toString());
        System.out.println(some.getДаТакТожеМожно());
        System.out.println(some.noMoreSecrets = "(ಠ_ಠ)");
        System.out.println(some.count());
        some.soTellMeAboutInterfaces();

        Annotation[] some2 = some.getClass().getAnnotations();
        System.out.println(Arrays.toString(some2));


    }
}
