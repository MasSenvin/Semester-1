public class Pratikum4no9 {
    public static void main(String[] args) {
        boolean rabbit = true;
        boolean donkey = false;
        boolean leporidae = true;
        //di if pertama jika menggunakan (&&) dan satu false maka hasilnya tetep false --->(false && true == false)berlaku sebaliknya
        if (rabbit && donkey | donkey & leporidae | donkey)
            System.out.print("DOG ");
        //di if kedua jika menggunakan (||) dan yang lain false dan yangsatu true hasilnya tetp true --->(false || true == true)berlaku sebaliknya
        if (rabbit & donkey | donkey & leporidae | donkey| rabbit)
            System.out.println("CAT ");
}

    }
