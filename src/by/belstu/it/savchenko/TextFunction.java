package by.belstu.it.savchenko;

public class TextFunction {
    public int test;


    public void setTest(int test) {
        this.test = test;
    }

    public int getTest() {
        return test;
    }

    public String getValue(){
            Test();
            onCreatefori();
            return "Helo from First pr";
        }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public TextFunction() {
    }

    private void Test() {
        String one = "";
        for (int i = 0; i<9; i++){
            if (i > -1 && i < 10) System.out.println(i);
        }
    }

    private  void onCreatefori(){
        for(int i = 0; i<10; i++){
            System.out.println("Counter" + i );
        }
    }

}
