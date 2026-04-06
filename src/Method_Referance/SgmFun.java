package Method_Referance;

@FunctionalInterface
public interface SgmFun <T,U>{


    //in this T as Type
    //U as return

    U read(T t);
}
