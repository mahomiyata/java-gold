package chap1;

public class SampleFactory {

    public static void main(String[] args) {
        create().execute();
    }

    public static Sample create() {
//        You can't make an instance from an inner class like this:
//        return new SampleInpl();
        return new SampleInpl();
    }

    private static class SampleInpl implements Sample {

        @Override
        public void execute() {
            System.out.println("test execute");
        }

    }
}
