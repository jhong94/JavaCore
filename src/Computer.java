public class Computer {
    public static void main(String [] args){
        PcBuilder myPc = new PcBuilder();
        myPc.gPU = "nVidia GeForce RTX";
        myPc.cPU = "AMD Ryzen";
        myPc.motherBoard = "Tomahawk";
        myPc.ram = "Corsair VENGEANCE";
        System.out.println(myPc.gPU);
        System.out.println(myPc.cPU);
        System.out.println(myPc.motherBoard);
        System.out.println(myPc.ram);
    }

}
