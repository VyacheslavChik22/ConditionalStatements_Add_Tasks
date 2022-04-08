public class addTasksConditionalStatements {
    public static void main(String[] args) {
// ������� 6: �������� ���������, ������� ����������, ����� ����� �� �������� ����� �������� ������.


        int age = 19;                  // ���������� ��� �������� �������� �������� �������
        double salary = 58_000;        // ���������� ��� �������� �������� �������� �������
        double limit;                  // ���������� ��� �������� �������� ������ ���������� ���������� ������ �������

        System.out.println("\n*** ������� 6 *** \n� ����� ������� ������ ����� �������� ��������� �����, ���� ��� " + age + " " +
                "��� � ��� �������� " + salary +
                " ������\n");
        //����� ������ 18, �� ������ 23 ���

        if (age >= 18 && age < 23 && salary < 50000) { //c �.�. ����� 50000�. �� ������������� ����� � ������� 2 �������.
            limit = salary * 2;
            System.out.println("��� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");

        } else if (age >= 18 && age < 23 && salary >= 50000 && salary < 80000) {// c �.�. ������ ��� ����� 50000�. �� ����� 80000�.
            // �� ����������� ����� � 1.2 ����.
            limit = (salary * 2) * 1.2;
            System.out.println("��� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");

        } else if (age >= 18 && age < 23 && salary >= 80000) {  // c �.�., ������ ��� ����� 80000�. �� ����������� ����� � 1.5 ����.
            limit = (salary * 2) * 1.5;
            System.out.println("��� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");
        }

        // ����� ������ (��� �����) 23, �� ������ 70 ���

        else if (age >= 23 && age < 70 && salary < 50000) { //c �.�. ����� 50000�. �� ������������� ����� � ������� 3 �������.
            limit = salary * 3;
            System.out.println("��� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");

        } else if (age >= 23 && age < 70 && salary >= 50000 && salary < 80000) {// c �.�. ������ ��� ����� 50000�. �� ����� 80000�.
            // �� ����������� ����� � 1.2 ����.
            limit = (salary * 3) * 1.2;
            System.out.println("��� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");

        } else if (age >= 18 && age < 23 && salary >= 80000) {  // c �.�., ������ ��� ����� 80000�. �� ����������� ����� � 1.5 ����.
            limit = (salary * 3) * 1.5;
            System.out.println("��� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");
        } else {                         // ����� ������ 18 ��� ������ 70 ��� �� �� ������������� ������!
            System.out.println("��� �������� � �������.");
        }

// ������� 7: �������� ��������� ��� ���������������� ���������/������ ������ �� �������.
        int age2 = 19;                           // ������� �������
        int loanTerms = 12;                      // ���� ������������ ... �������
        double salary2 = 90_000;                 // �������� �������
        double maxPayment = salary2 / 2;         // ����������� ���������� ������
        double wantedSum = 330_000;              // �������� ����� �������
        double baseRate = 10;                    // ������� ������ � ���������
        double MonthlyPayment;                   // ����������� ������
        double annuity;                          // ����������� ���������
        double monthRate;                        // ������ �������� � �����
        System.out.println("\n*** ������� 7 *** \n������� �������: ���� ������� " + age2 + " ��� � ��� �������� " + salary2 +
                " " +
                "������. ������ �� " + loanTerms +
                " ������� \n");


        if (age2 > 18 && age2 < 23 && salary2 < 80000) {   // ���� ������� ������ 23 � �.�. ������ 80000 �� ��������� 1% � ������
            baseRate = baseRate + (baseRate / 100);
            System.out.println("���� ������, �� �������� ��������, ��������� " + baseRate + "% �������");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0; // �������� ������ �� �������
            if (MonthlyPayment > maxPayment) {         // ���� �������� ������ ������ ����������� ����������� �� ������ �� ��������!
                System.out.println("������������ ������ ��� ��  " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. � ������� ��������.");
            } else {
                System.out.println("������������ ������ ��� �� " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. ������ �������.");
            }
        } else if (age2 >= 23 && age2 < 30 && salary2 < 80000) {// ���� ������� ������ 30 � �.�. ������ 80000 �� ��������� 0,5% �
            // ������
            baseRate = baseRate + (baseRate / 100) / 2;
            System.out.println("���� ������, �� �������� ��������, ��������� " + baseRate + "% �������");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0;
            if (MonthlyPayment > maxPayment) {         // ���� �������� ������ ������ ����������� ����������� �� ������ �� ��������!
                System.out.println("������������ ������ ��� ��  " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. � ������� ��������.");
            } else {
                System.out.println("������������ ������ ��� �� " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. ������ �������.");
            }
        } else if (age2 > 18 && age2 < 23 && salary2 > 80000) {   // ���� ������� ������ 23 � �.�. ������ 80000 ��
            // ������ ��������� �� 0.7%
            baseRate = baseRate - (baseRate / 1000) * 7;
            System.out.println("���� ������, �� �������� ��������, ��������� " + baseRate + "% �������");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0; // �������� ������ �� �������
            if (MonthlyPayment > maxPayment) {         // ���� �������� ������ ������ ����������� ����������� �� ������ �� ��������!
                System.out.println("������������ ������ ��� ��  " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. � ������� ��������.");
            } else {
                System.out.println("������������ ������ ��� �� " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. ������ �������.");
            }
        } else if (age2 >= 23 && age2 < 30 && salary2 > 80000) {// ���� ������� ������ 30 � �.�. ������ 80000 �� ������ ���������
            // �� 0,7%

            baseRate = baseRate - (baseRate / 1000) * 7;
            System.out.println("���� ������, �� �������� ��������, ��������� " + baseRate + "% �������");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0;
            if (MonthlyPayment > maxPayment) {         // ���� �������� ������ ������ ����������� ����������� �� ������ �� ��������!
                System.out.println("������������ ������ ��� ��  " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. � ������� ��������.");
            } else {
                System.out.println("������������ ������ ��� �� " + salary2 + " ����� " + maxPayment + " ������. ������ �� " +
                        "������� " +
                        "��������: " + MonthlyPayment + " ������. ������ �������.");
            }
        }


// ������� 1.4 �����
        System.out.println("\n**** Ping-Pong ****");

        int[] arr = new int[20];                   // ��������� ������ �� 20 ���������.
        for (int i = 0; i < arr.length; i++) {     // �������� �� ��������� �������
            arr[i] = i + 1;                         // ����������� ��������� ������� �������� �� 1 �� 20
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i] + ": Ping");
            } else if (arr[i] % 5 == 0) {
                System.out.println(arr[i] + ": Pong");
            } else if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println(arr[i] + ": Ping-Pong");
            } else {
                System.out.println(arr[i] + ": ");

            }
        }


// ������� 5
        System.out.println("\n**** 10 ����� ��������� ****");
        int a = 1;
        int b = 0;
        int c = 0;
       // ���������� ����  for ��� ����������� �� 0 �� 10
        for(int i = 0; i < 10; i++){
            c = a + b;                  // ���������� '�' ��� ����� 1 // ���������� '�' ��� ����� 2
            System.out.print(b + " ");  // ������� �������  b = 0     // ������ �������  b = 1
            b = c;                      //  b = 1                     // ������ b = 2
            a = b;                      //  � = b =  1                // ������ � = b =  2
        }
    }
}
