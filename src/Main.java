//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] cameras = {"CANON","SONY","NIKON"};
        String[] cType ={"MIRRORLESS","DSLR"};
        double[][] prices = {
                {10500.00, 8500.00},
                {9500.00, 7200.00},
                {12000.00, 8000.00}
        };

        System.out.println("--------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("--------------------------------------------------");

        System.out.printf("%-15s","");

        for (int cam = 0; cam<cType.length;cam++){
            System.out.printf("%-17s", cType[cam]);
        }

        System.out.println();

        for (int cam = 0; cam < cameras.length;cam++){
            System.out.printf("%-15s", cameras[cam]);

            for (int price = 0; price < prices[cam].length; price++) {
                System.out.printf("R %-15.2f", prices[cam][price]);
            }

            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("--------------------------------------------------");

        for (int cam = 0; cam < cameras.length;cam++){
            double diff = prices[cam][0]- prices[cam][1];

            if (diff<0){
                diff = diff * -1;
            }


            System.out.printf("%-15s",cameras[cam],diff);
            System.out.printf("%-15s",diff);

            if (diff>= 2500){

                System.out.println(" ***");
            }

            System.out.println();


        }
        System.out.println("--------------------------------------------------");
    }
}