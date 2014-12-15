package miniexcel;

public class Ark {

	private int[][] data;

	public Ark(int[][] data) {
		this.data = data;
	}

	public void skrivUt() {

		System.out.println("---------------");

		for (int i = 0; i < data.length; i++){
            for (int h = 0; h < data[i].length; h++){
                int a = data [i][h];
                System.out.print(a + " ");

            }
            System.out.println();
        }

		System.out.println("---------------");
	}

	public void beregnSum() {
        for (int i = 0; i < data.length; i++){
            int b = 0;
            int c = 0;

            for (int h = 0; h < data[i].length - 1; h++){
                int a = data [i][h];
                data [4][h] =
                b += a;
                System.out.print(a + " ");

            }
            System.out.println(b);
        }


		// TODO - START

		// summer rekker og oppdater

		// summer kolonner og oppdater

		// TODO - SLUTT
	}

}
