fun main(){
    println("Выберите пособ оплаты: 1.Наличный расчет 2.СБП 3.Киви 4.Boosty 5.Натурой")
    val a = readln().toInt()
    when(a){
        1 -> println("Ближайший адресс нашей конторы - Улица Пушкина Дом Колтушкина")
        2 -> println("Выберете ваш банк, и оплотите")
        3 -> println("Введите данные вашего аккаунта Киви")
        4 -> println("Перейдите в приложение Boosty")
        5 -> println("Приходите ко мне домой. Адересс - Улица Пушкина Дом Колотушкина/2")
        else -> println("Нет выбранного способа оплаты")
    }
}