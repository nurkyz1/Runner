public class Runner extends Thread {
    private Runner runner;


    public Runner(String name) {
        super(name);
    }

    public Runner(String name, Runner runner) {
        super(name);
        this.runner = runner;
    }
    public void  run(){
        if (runner != null){
            runner.start();
        }
        System.out.println(this.getName()+" берет палочку");

        if (runner != null) {
            System.out.println(this.getName()+" бежит к "+ runner.getName());

            System.out.println(runner.getName()+" бежит к "+ this.getName());

            if (runner!= null){
                System.out.println(runner.getName()+ " берет палочку "+this.getName());
            }

        }

    }
}
