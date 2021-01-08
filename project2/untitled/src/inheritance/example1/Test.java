package inheritance.example1;

public class Test {
    public static void main(String[] args) throws NumberException {
        Ishape p1;
        if(args.length<1||args.length>3){
            try {
                throw new NumberException();
            }catch (NumberException n){

          n.printStackTrace();;

            }

        }
        else if (args.length==1){
            double arg=Double.parseDouble(args[args.length-1]);
            new Circle(arg).Area();

        }
        else if(args.length==2){
            double[]  arg;
            arg = new double[args.length];
            for (int i=0;i<args.length;i++){
                 arg[i]=Double.parseDouble(args[i]);
            }
            new  Rect(arg[0],arg[1]).Area();
        }
        else if(args.length==3){
            double[]  arg;
            arg = new double[args.length];
            for (int i=0;i<args.length;i++){
                arg[i]=Double.parseDouble(args[i]);
            }
            new  Triangle(arg[0],arg[1],arg[2]).Area();
        }



    }
}
