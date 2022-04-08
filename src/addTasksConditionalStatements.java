public class addTasksConditionalStatements {
    public static void main(String[] args) {
// Задание 6: Написать программу, которая показывает, какую сумму на кредитке может получить клиент.


        int age = 19;                  // Переменная для хранения значения возраста клиента
        double salary = 58_000;        // Переменная для хранения значения зарплаты клиента
        double limit;                  // Переменная для хранения значения выдачи возможного кредитного лимита клиенту

        System.out.println("\n*** Задание 6 *** \nС каким лимитом клиент может получить кредитную карту, если ему " + age + " " +
                "лет и его зарплата " + salary +
                " рублей\n");
        //Людям старше 18, но младше 23 лет

        if (age >= 18 && age < 23 && salary < 50000) { //c З.П. менее 50000р. мы предоставляем лимит в размере 2 зарплат.
            limit = salary * 2;
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей».");

        } else if (age >= 18 && age < 23 && salary >= 50000 && salary < 80000) {// c З.П. равной или болше 50000р. но менее 80000р.
            // мы увеличиваем лимит в 1.2 раза.
            limit = (salary * 2) * 1.2;
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей».");

        } else if (age >= 18 && age < 23 && salary >= 80000) {  // c З.П., равной или болше 80000р. мы увеличиваем лимит в 1.5 раза.
            limit = (salary * 2) * 1.5;
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей».");
        }

        // Людям старше (или равно) 23, но младше 70 лет

        else if (age >= 23 && age < 70 && salary < 50000) { //c З.П. менее 50000р. мы предоставляем лимит в размере 3 зарплат.
            limit = salary * 3;
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей».");

        } else if (age >= 23 && age < 70 && salary >= 50000 && salary < 80000) {// c З.П. равной или болше 50000р. но менее 80000р.
            // мы увеличиваем лимит в 1.2 раза.
            limit = (salary * 3) * 1.2;
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей».");

        } else if (age >= 18 && age < 23 && salary >= 80000) {  // c З.П., равной или болше 80000р. мы увеличиваем лимит в 1.5 раза.
            limit = (salary * 3) * 1.5;
            System.out.println("«Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей».");
        } else {                         // Людям младше 18 или старше 70 лет мы не предоставляем кредит!
            System.out.println("Вам отказано в кредите.");
        }

// Задание 7: Написать программу для предварительного одобрения/отказа заявки по кредиту.
        int age2 = 19;                           // Возраст клиента
        int loanTerms = 12;                      // Срок кредитования ... месяцев
        double salary2 = 90_000;                 // Зарплата клиента
        double maxPayment = salary2 / 2;         // Максимально допустимый платеж
        double wantedSum = 330_000;              // Желаемая сумма кредита
        double baseRate = 10;                    // Базовая ставка в процентах
        double MonthlyPayment;                   // Ежемесячный платеж
        double annuity;                          // Коэффициент аннуитета
        double monthRate;                        // Расчет процента в месяц
        System.out.println("\n*** Задание 7 *** \nРасчтет кредита: Если клиенту " + age2 + " лет и его зарплата " + salary2 +
                " " +
                "рублей. Сроком на " + loanTerms +
                " месяцев \n");


        if (age2 > 18 && age2 < 23 && salary2 < 80000) {   // Если возраст меньше 23 и З.П. меньше 80000 то добавляем 1% к ставке
            baseRate = baseRate + (baseRate / 100);
            System.out.println("Ваша ставка, по условиям договора, составила " + baseRate + "% годовых");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0; // Месячный платеж по кредиту
            if (MonthlyPayment > maxPayment) {         // Если месячный платеж больше максимально допустимого то кредит не одобряем!
                System.out.println("Максимальный платеж при ЗП  " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. В кредите отказано.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. Кредит одобрен.");
            }
        } else if (age2 >= 23 && age2 < 30 && salary2 < 80000) {// Если возраст меньше 30 и З.П. меньше 80000 то добавляем 0,5% к
            // ставке
            baseRate = baseRate + (baseRate / 100) / 2;
            System.out.println("Ваша ставка, по условиям договора, составила " + baseRate + "% годовых");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0;
            if (MonthlyPayment > maxPayment) {         // Если месячный платеж больше максимально допустимого то кредит не одобряем!
                System.out.println("Максимальный платеж при ЗП  " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. В кредите отказано.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. Кредит одобрен.");
            }
        } else if (age2 > 18 && age2 < 23 && salary2 > 80000) {   // Если возраст меньше 23 и З.П. больше 80000 то
            // ставку уменьшаем на 0.7%
            baseRate = baseRate - (baseRate / 1000) * 7;
            System.out.println("Ваша ставка, по условиям договора, составила " + baseRate + "% годовых");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0; // Месячный платеж по кредиту
            if (MonthlyPayment > maxPayment) {         // Если месячный платеж больше максимально допустимого то кредит не одобряем!
                System.out.println("Максимальный платеж при ЗП  " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. В кредите отказано.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. Кредит одобрен.");
            }
        } else if (age2 >= 23 && age2 < 30 && salary2 > 80000) {// Если возраст меньше 30 и З.П. больше 80000 то ставку уменьшаем
            // на 0,7%

            baseRate = baseRate - (baseRate / 1000) * 7;
            System.out.println("Ваша ставка, по условиям договора, составила " + baseRate + "% годовых");
            monthRate = (baseRate / 12) / 100;
            annuity = monthRate * Math.pow((1 + monthRate), loanTerms) / (Math.pow((1 + monthRate), loanTerms) - 1);

            MonthlyPayment = Math.round((annuity * wantedSum) * 100.0) / 100.0;
            if (MonthlyPayment > maxPayment) {         // Если месячный платеж больше максимально допустимого то кредит не одобряем!
                System.out.println("Максимальный платеж при ЗП  " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. В кредите отказано.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по " +
                        "кредиту " +
                        "составит: " + MonthlyPayment + " рублей. Кредит одобрен.");
            }
        }


// Задание 1.4 Циклы
        System.out.println("\n**** Ping-Pong ****");

        int[] arr = new int[20];                   // обьявляем массив на 20 элементов.
        for (int i = 0; i < arr.length; i++) {     // Проходим по элементам массива
            arr[i] = i + 1;                         // Присваиваем элементам массива значения от 1 до 20
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


// Задание 5
        System.out.println("\n**** 10 Чисел Фибоначчи ****");
        int a = 1;
        int b = 0;
        int c = 0;
       // Используем цикл  for для прохождения от 0 до 10
        for(int i = 0; i < 10; i++){
            c = a + b;                  // переменная 'с' уже равна 1 // переменная 'с' уже равна 2
            System.out.print(b + " ");  // сначала выводим  b = 0     // теперь выводим  b = 1
            b = c;                      //  b = 1                     // теперь b = 2
            a = b;                      //  а = b =  1                // теперь а = b =  2
        }
    }
}
