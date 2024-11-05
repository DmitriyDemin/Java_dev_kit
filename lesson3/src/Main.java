public class Main {
    private static class Box {
        private Object obj;
        public Box (Object obj){
            this.obj = obj;
        }
        public Object getObj(){return obj;}
        public void setObj(Object obj){this.obj = obj;}
        public void printInfo (){
            System.out.printf("Box (%s): %s", obj.getClass().getSimpleName(), obj.toString());
        }
    }

    public static void main (String[] srgs){
        Box b1 = new Box(20);
        Box b2 = new Box(30);
        System.out.println((Integer) b1.getObj()+(Integer) b2.getObj());

        Box b3 = new Box("hello, ");
        Box b4 = new Box("world");
        System.out.println((String) b3.getObj()+(String) b4.getObj());

        Box b5 = new Box('6');
        Box b6 = new Box('h');
        System.out.println((String) b5.getObj()+(String) b6.getObj());

    }




}
