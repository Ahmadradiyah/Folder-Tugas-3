public class Kalkulator {
    double angka1, angka2;
    char operator;

    public Kalkulator(double angka1, double angka2, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
    }

    public double hitung(double angka1, double angka2, char operator) {
        switch (operator) {
            case '+':
                return angka1 + angka2;
            case '-':
                return angka1 - angka2;
            case '*':
                return angka1 * angka2;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Error: pembagian dengan nol!");
                    return 0;
                }
                return angka1 / angka2;
            default:
                System.out.println("Operator tidak valid.");
                return 0;
        }
    }
}
