import java.util.*

fun main(args: Array<String>) {
    println("hello, world")
}

/*
    if number is odd so it's awesome
    if the number is even we will divide by 2
    to check if the division is odd or not if odd so number is awesome if division reach 1 so its not awesome

     */
fun Int.isAwesome(): Boolean {
    var divResult = this
    if (this % 2 != 0)
        return true
    else {
        while (divResult / 2 != 1) {
            divResult /= 2
            if (divResult % 2 != 0)
                return true

        }
        return false
    }

}

/*
* we will compare reversed string with string*/
fun Int.isPalindrome(): Boolean {
    return this.toString() == this.toString().reversed()
}

/*
we will loop for string index and shift the last char and check if the 2 strings equals or not
* */
fun areRotation(str1: String, str2: String): Boolean {
    val list = str1.toList()
    for (char in str1) {
        Collections.rotate(list, 1)
        if (list.joinToString("") == str2)
            return true
    }
    return false
}