public class Introduction {
    public static void main(String[] args) {
        System.out.println("Nguyễn Mạnh Dương" + "\t" + "24020105" + "\t" + "K69-IT6" + "\t" + "NMDuong26" + "\t" + "24020105@vnu.edu.vn");

        for (int i = 9; i >= 1; i--) {
            System.out.print(i + " bottle");
            if (i > 1) {
                System.out.print("s");
            }
            System.out.print(" of beer on the wall, " + i + " bottle");
            if (i > 1) {
                System.out.print("s");
            }
            System.out.println(" of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}
