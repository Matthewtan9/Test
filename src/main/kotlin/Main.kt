fun main(args: Array<String>) {
    managingString()
    grade()
    gradeWhen()
    oddNumber()
    array()
    range()
}
fun managingString()
{
    var firstName: String= " Matthew "
    var lastName: String= " Tan "
    var age: Int = 21
    var home: String = " 820 "
println(lastName+ " " + firstName + " " + age + " " + home)
    println(lastName.plus(firstName).plus(age).plus(home))
    println("My name is $firstName $lastName" + "  age is $age" + "  home is $home ")
    println("The lenght of my of my name is: ${(firstName).plus(lastName).length}")
    println("The lenght of my of my name is: ${(lastName).plus(firstName).last()}")
}
fun grade() {
    var g = 80;
    if (g <= 55) {
        println("FAIL!")

    } else if (g <= 60)
        println("D")
    else if(g<= 70)
        println("C")
    else if  (g <= 80)
        println("B")
    else if (g <= 90)
        println("A")
    else
        println("A+")
}

fun gradeWhen() {
    val x1: Int = 82
    when (x1) {
    in 50.. 53 -> {
            println("FAIL")
        }

       in 54..59 -> {
            println("D")
        }

       in 60..79 -> {
            println("C")
        }

        in 80..89 -> {
            println("B")
        }

        in 90..99 -> {
            println("A")
        }

        else -> {
            println("A +")

        }
    }
}
fun oddNumber() {
    val numb: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 0
    val x = 5
    val y: Int = 1
    var oddNumb: List<Int> = numb.filter { x: Int -> x % 2 != 0 }
    var evenNumb: List<Int> = numb.filter { x: Int -> x % 2 == 0 }

    while (i < numb.size) {
        println(numb[i])
        i++
    }
    if (x % 2 != 0)
        println("Sum of odd numbers to total  number :  ${x + numb.sum()}")

    while (x % 2 == 0) {
        println("${x + y}")
        continue
    }
while (x < 0.0){
            break
        }
}
fun array() {
    val numb = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 0
    var x = 0
    val toFind = 3
    var found = false
    while (i < 11) {
        print("$i" + ",")
        i++
        if (i == 11) {
            break
        }
    }
        println(numb.size)
        while (x < numb.size) {
            println(numb[x] * 2)
            x++

        }
        for (n in numb) {
            if (n == toFind) {
                found = true
                break
            }
        }
            if (found)
                println("success")
            else
                println("failed")
        }

fun range() {
    val start = 1
    val end = 10
    val toFind = 7
    var found = false
    for (ch in start..end) {
        if (ch == toFind) {
            found = true
            break
        }
    }
        if (found)
            println("Found")
        else
            println("Not found")
    }


























