package sorting;

@FunctionalInterface
public interface Operation {
      void action();

      static double actionRuntimeCounting(Operation function) {
            double startT = System.currentTimeMillis();
            function.action();
            double finishT = System.currentTimeMillis();
            return finishT - startT;
      }

      default Operation combineOperation(Operation that){
            return () -> {
                  this.action();
                  that.action();
            };
      }
}
