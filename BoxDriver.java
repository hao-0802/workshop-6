// Boxes class
class Boxes{
    private int size;

    //构造方法，接收盒子大小
    public Boxes(int size){
        setSize(size); //复用set做边界检查
    }

    //setter，最大10
    public void setSize(int size){
        if(size > 10) size = 10;
        if(size <1 ) size =1;
        this.size = size;
    }

    //toString 返回 "N x N"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    //draw方法，控制台画方框
    public void draw(){
        System.out.println("\nDrawing box: "+ this);
        //第一行：顶边框 -----
        for(int i=0;i<size;i++){
            System.out.print("-");
        }
        System.out.println();

        //中间行 |   |
        for(int row=0; row < size -2; row++){
            System.out.print("|");
            for(int col=0;col<size-2;col++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

        //底边框
        for(int i=0;i<size;i++){
            System.out.print("-");
        }
        System.out.println();
    }
}

// Driver 驱动类，main在这里
public class BoxDriver {
    public static void main(String[] args) {
        Boxes box1 = new Boxes(4);
        box1.draw();
        System.out.println(box1); //自动调用toString

        Boxes box2 = new Boxes(10);
        box2.draw();
        System.out.println(box2);

        Boxes box3 = new Boxes(12); //超过10，自动限制为10
        box3.draw();
    }
}
