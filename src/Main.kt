fun acceptCustomerInfo(customerType: String, vararg info: String) {
    when (customerType) {
        "residential" -> {
            println("Residential Customer Information:")
            println("Name: ${info[0]}")
            println("Phone Number: ${info[1]}")
        }
        "business" -> {
            println("Business Customer Information:")
            println("Business Name: ${info[0]}")
            println("Contact Name: ${info[1]}")
            println("Phone Number: ${info[2]}")
        }
        else -> println("Invalid customer type.")
    }
}

fun main() {

    acceptCustomerInfo("residential", "Joe Davidson", "1234567890")

    acceptCustomerInfo("business", "Dub Boyz Gaming", "Luke Davidson", "9876543210")
}