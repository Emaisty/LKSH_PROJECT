val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    println("Программа для хранения значений и поиску их по ключу. Для выбора команды, введите номер команды в списке.\n")
    val map = mutableMapOf<String, String>()
    while (true) {
        Thread.sleep(1_000)
        println("Список команд:")
        println("1) Ввести значение в базу данных.")
        println("2) Удалить значение из базы данных.")
        println("3) Поиск значения по базе.")
        println("4) Примечание.")
        println("5) Выход.\n\n")
        val comand = scan.nextInt()
        if (comand == 1) {
            println("Введите ключ")
            print(">>")
            val key = scan.next()
            println("\nВведите значение")
            print(">>")
            val text = scan.next()
            map[key] = text
            println("\nЗначение записанно.\n")
        } else {
            if (comand == 2) {
                println("Удаление по ключу(1) или по значению(2)?\n>>")
                val comand = scan.nextInt()
                if (comand == 1){
                    println("\nВведите ключ")
                    print(">>")
                    val key = scan.next()
                    val it = map.iterator()
                    var i = 0
                    for (pair in it) {
                        if (pair.key == key){
                            it.remove()
                            i++;
                        }
                    }
                    println("Удаленно $i объектов.\n")
                } else {
                    println("\nВведите значение")
                    print(">>")
                    val value = scan.next()
                    val it = map.iterator()
                    var i = 0
                    for (pair in it) {
                        if (pair.value == value){
                            it.remove()
                            i++;
                        }
                    }
                    println("Удаленно $i объектов.\n")
                }

            } else {
                if (comand == 3) {
                    println("Введите ключ")
                    print(">>")
                    val key_print = scan.next()
                    var i = 1
                    for ((key,value) in map){
                        if (key_print in key) {
                            println("$i) " + map[key])
                            i++
                        }
                    }
                    if (i == 1)
                        print("Empty.")
                    print("\n\n")
                } else {
                    if (comand == 4) {
                        println("Хранятся значения в базе по принципу ключ-значени.")
                        println("Взаимодействие со значениями происходит по ключу: поиск и удаление")
                        println("Ключ и значение являются строками(String).")
                        println("Значение хранятся только во время работы программы.")
                        println("Удаление значений происходит только по точному ключу.\n")
                        Thread.sleep(15_000)
                    } else {
                        if (comand == 5) {
                            println("Завершение программы.")

                            break
                        } else {
                            println("Команда не распознана.\n")
                        }
                    }
                }
            }
        }
    }
}