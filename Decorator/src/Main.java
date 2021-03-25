
public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nNah Sama,100000\nElon Gate,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                            new EncryptionDecorator(
                                                    new FileDataSource("out/OutputDemo.txt")));
        //write encoded data to OutputDemo.txt
        encoded.writeData(salaryRecords);

        //encoded data
        DataSource plain;
        plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
