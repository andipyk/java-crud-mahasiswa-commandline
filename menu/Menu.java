package day_11_pr.menu;

import day_11_pr.MyMethod;

public class Menu {
    static MyMethod my_method = new MyMethod();

    public String pilihan_menu()  {
        String[] menu_list = {
                "Create & Input Data Mahasiswa",
                "Edit or Delete Data Mahasiswa",
                "Tampilkan laporan Nilai Data Mahasiswa"
        };

        generate_menu(menu_list);

        return "pilihan_menu() telah dijalankan";

    }

    void generate_menu(String[] menu) {
        String paramsMenu = "";
        while (!paramsMenu.equals("99")) {
            int nomor = 1;
            System.out.println("Menu");
            for (String item : menu) {
                System.out.println(nomor + ". " + item);
                nomor++;
            }
            System.out.println("99. Exit");
            paramsMenu = my_method.input("menu");
//            switchProgram(paramsMenu);
        }
    }

}
